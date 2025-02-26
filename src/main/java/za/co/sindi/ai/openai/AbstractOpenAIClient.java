/**
 * 
 */
package za.co.sindi.ai.openai;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

import za.co.sindi.ai.openai.exception.OpenAIException;
import za.co.sindi.ai.openai.models.OpenAIError;
import za.co.sindi.commons.net.http.WithErrorBodyHandler;
import za.co.sindi.commons.net.sse.Event;
import za.co.sindi.commons.net.sse.MessageEvent;
import za.co.sindi.commons.util.Either;
import za.co.sindi.commons.utils.Strings;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public abstract class AbstractOpenAIClient implements OpenAIClient {
	
	private final String openAIKey;
	private final String organizationId;
	
	private Duration connectionTimeout;
	private ProxySelector proxy;
	private Executor executor;

	/**
	 * @param openAIKey
	 * @param organizationId
	 */
	protected AbstractOpenAIClient(String openAIKey, String organizationId) {
		super();
		this.openAIKey = Objects.requireNonNull(openAIKey, "An OpenAI Key is required.");
		this.organizationId = organizationId;
	}
	
	/**
	 * @param connectionTimeout the connectionTimeout to set
	 */
	public void setConnectionTimeout(Duration connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	/**
	 * @param proxy the proxy to set
	 */
	public void setProxy(ProxySelector proxy) {
		this.proxy = proxy;
	}

	/**
	 * @param executor the executor to set
	 */
	public void setExecutor(Executor executor) {
		this.executor = executor;
	}
	
	protected HttpRequest.Builder createHttpRequestBuilder(final OpenAIRequest request, final BodyPublisher bodyPublisher) {
		HttpRequest.Builder httpRequestBuilder = HttpRequest.newBuilder(request.getUri())
															.header("Authorization", "Bearer " + openAIKey)
															.method(request.getMethod(), bodyPublisher == null ? BodyPublishers.noBody() : bodyPublisher);
		
		if (!Strings.isNullOrEmpty(organizationId)) {
			httpRequestBuilder.header("OpenAI-Organization", organizationId);
		}
		
		if (!Strings.isNullOrEmpty(request.getContentType())) {
			httpRequestBuilder.header("Content-Type", request.getContentType());
		}
		
		return httpRequestBuilder;
	}
	
	protected HttpRequest.Builder applyNewAssistant(final HttpRequest.Builder builder) {
		return builder.header("OpenAI-Beta", "assistants=v2");
	}

	protected <R> HttpResponse<Either<R, String>> send(final HttpRequest.Builder httpRequestBuilder, final BodyHandler<R> bodyHandler) throws IOException, InterruptedException {
		HttpRequest httpRequest = httpRequestBuilder.build();
		HttpClient httpClient = createHttpClient();
		return httpClient.send(httpRequest, new WithErrorBodyHandler<R>(bodyHandler));
	}
	
	protected <R> CompletableFuture<HttpResponse<Either<R, String>>> sendAsync(final HttpRequest.Builder httpRequestBuilder, final BodyHandler<R> bodyHandler) {
		HttpRequest httpRequest = httpRequestBuilder.build();
		HttpClient httpClient = createHttpClient();
		return httpClient.sendAsync(httpRequest, new WithErrorBodyHandler<R>(bodyHandler));
	}
	
	protected <R> R validateAndHandleHttpResponse(final HttpResponse<Either<R, String>> httpResponse, final ObjectTransformer objectTransformer) {
		Either<R, String> either = httpResponse.body();
		if (either.isRightPresent()) {
			OpenAIError apiError = objectTransformer.transform(either.getRight(), OpenAIError.class);
			throw new OpenAIException(apiError.getError());
		}
		
		return either.getLeft();
	}
	
	protected <R> Stream<R> handleStream(final Stream<Event> events, final ObjectTransformer objectTransformer, Class<R> entityClassType) {
		List<R> result = new ArrayList<>();
		events.forEach(event -> {
			if (event instanceof MessageEvent message) {
				String content = message.getData();
				if (!"[DONE]".equals(content)) {
					result.add(objectTransformer.transform(content, entityClassType));
				}
			}
		});
		
		return Collections.unmodifiableList(result).stream();
	}
	
	private HttpClient createHttpClient() {
		HttpClient.Builder httpClientBuilder = HttpClient.newBuilder();
		if (connectionTimeout != null) {
			httpClientBuilder.connectTimeout(connectionTimeout);
		}
		
		if (proxy != null) {
			httpClientBuilder.proxy(proxy);
		}
		
		if (executor != null) {
			httpClientBuilder.executor(executor);
		}
		
		return httpClientBuilder.build();
	}
}
