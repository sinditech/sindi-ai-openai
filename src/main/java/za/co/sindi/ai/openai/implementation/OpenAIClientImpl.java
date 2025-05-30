/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

import za.co.sindi.ai.openai.AbstractOpenAIClient;
import za.co.sindi.ai.openai.HttpFormDataUtils;
import za.co.sindi.ai.openai.ObjectTransformer;
import za.co.sindi.ai.openai.assistants.CreateAssistantRequest;
import za.co.sindi.ai.openai.assistants.DeleteAssistantRequest;
import za.co.sindi.ai.openai.assistants.ListAssistantRequest;
import za.co.sindi.ai.openai.assistants.ModifyAssistantRequest;
import za.co.sindi.ai.openai.assistants.RetrieveAssistantRequest;
import za.co.sindi.ai.openai.audio.AudioSpeechRequest;
import za.co.sindi.ai.openai.audio.AudioTranscriptionRequest;
import za.co.sindi.ai.openai.audio.AudioTranslationRequest;
import za.co.sindi.ai.openai.chat.ChatCompletionRequest;
import za.co.sindi.ai.openai.chat.DeleteChatCompletionRequest;
import za.co.sindi.ai.openai.chat.GetChatCompletionRequest;
import za.co.sindi.ai.openai.chat.GetChatMessagesRequest;
import za.co.sindi.ai.openai.chat.ListChatCompletionsRequest;
import za.co.sindi.ai.openai.chat.UpdateCompletionRequest;
import za.co.sindi.ai.openai.completions.CompletionRequest;
import za.co.sindi.ai.openai.embeddings.CreateEmbeddingRequest;
import za.co.sindi.ai.openai.files.DeleteFileRequest;
import za.co.sindi.ai.openai.files.ListFileRequest;
import za.co.sindi.ai.openai.files.RetrieveFileContentRequest;
import za.co.sindi.ai.openai.files.RetrieveFileRequest;
import za.co.sindi.ai.openai.files.UploadFileRequest;
import za.co.sindi.ai.openai.fine_tuning.CancelFineTuningJobRequest;
import za.co.sindi.ai.openai.fine_tuning.CreateFineTuningJobRequest;
import za.co.sindi.ai.openai.fine_tuning.ListFineTuningEventRequest;
import za.co.sindi.ai.openai.fine_tuning.ListFineTuningJobRequest;
import za.co.sindi.ai.openai.fine_tuning.RetrieveFineTuningJobRequest;
import za.co.sindi.ai.openai.images.ImageEditRequest;
import za.co.sindi.ai.openai.images.ImageRequest;
import za.co.sindi.ai.openai.images.ImageVariationRequest;
import za.co.sindi.ai.openai.model.DeleteModelRequest;
import za.co.sindi.ai.openai.model.ListModelRequest;
import za.co.sindi.ai.openai.model.RetrieveModelRequest;
import za.co.sindi.ai.openai.models.Assistant;
import za.co.sindi.ai.openai.models.AssistantList;
import za.co.sindi.ai.openai.models.ChatCompletion;
import za.co.sindi.ai.openai.models.ChatCompletionChunk;
import za.co.sindi.ai.openai.models.ChatCompletionList;
import za.co.sindi.ai.openai.models.ChatCompletionMessageList;
import za.co.sindi.ai.openai.models.Completion;
import za.co.sindi.ai.openai.models.DeletionStatus;
import za.co.sindi.ai.openai.models.EmbeddingList;
import za.co.sindi.ai.openai.models.File;
import za.co.sindi.ai.openai.models.FileList;
import za.co.sindi.ai.openai.models.FineTuningEventList;
import za.co.sindi.ai.openai.models.FineTuningJob;
import za.co.sindi.ai.openai.models.FineTuningJobList;
import za.co.sindi.ai.openai.models.Image;
import za.co.sindi.ai.openai.models.ImageList;
import za.co.sindi.ai.openai.models.InputItemList;
import za.co.sindi.ai.openai.models.Model;
import za.co.sindi.ai.openai.models.ModelList;
import za.co.sindi.ai.openai.models.Moderation;
import za.co.sindi.ai.openai.models.Response;
import za.co.sindi.ai.openai.models.VectorStore;
import za.co.sindi.ai.openai.models.VectorStoreList;
import za.co.sindi.ai.openai.moderations.CreateModerationRequest;
import za.co.sindi.ai.openai.response.CreateModelResponseRequest;
import za.co.sindi.ai.openai.response.DeleteModelResponseRequest;
import za.co.sindi.ai.openai.response.GetModelResponseRequest;
import za.co.sindi.ai.openai.response.ListInputItemsRequest;
import za.co.sindi.ai.openai.vector_store.CreateVectorStoreRequest;
import za.co.sindi.ai.openai.vector_store.DeleteVectorStoreRequest;
import za.co.sindi.ai.openai.vector_store.ListVectorStoreRequest;
import za.co.sindi.ai.openai.vector_store.ModifyVectorStoreRequest;
import za.co.sindi.ai.openai.vector_store.RetrieveVectorStoreRequest;
import za.co.sindi.commons.net.sse.AllEventsEventHandler;
import za.co.sindi.commons.net.sse.SSEEventSubscriber;
import za.co.sindi.commons.util.Either;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class OpenAIClientImpl extends AbstractOpenAIClient {
	
	private ObjectTransformer transformer = new JSONObjectTransformer();
	
	/**
	 * @param openAPIKey
	 */
	public OpenAIClientImpl(String openAPIKey) {
		this(openAPIKey, null);
	}
	
	/**
	 * @param openAPIKey
	 * @param organizationId
	 */
	public OpenAIClientImpl(String openAPIKey, String organizationId) {
		super(openAPIKey, organizationId);
	}

	/**
	 * @param baseUrl
	 * @param openAIKey
	 * @param organizationId
	 */
	public OpenAIClientImpl(String baseUrl, String openAIKey, String organizationId) {
		super(baseUrl, openAIKey, organizationId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Completion send(CompletionRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput()))), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Completion.class);
	}

	@Override
	public CompletableFuture<Completion> sendAsync(CompletionRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput()))), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Completion.class)).toCompletableFuture();
	}

	@Override
	public Path send(AudioSpeechRequest request, Path ofPath) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<Path, String>> httpResponse = send(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getSpeech()))), BodyHandlers.ofFile(ofPath));
		return validateAndHandleHttpResponse(httpResponse, transformer);
	}

	@Override
	public CompletableFuture<Path> sendAsync(AudioSpeechRequest request, Path ofPath) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<Path, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getSpeech()))), BodyHandlers.ofFile(ofPath));
		return httpResponseFuture.thenApplyAsync(httpResponse -> validateAndHandleHttpResponse(httpResponse, transformer)).toCompletableFuture();
	}

	@Override
	public String send(AudioTranscriptionRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String boundary = HttpFormDataUtils.createMultipartBoundaryID();
		HttpResponse<Either<String, String>> httpResponse = send(createHttpRequestBuilder(request, za.co.sindi.commons.net.http.BodyPublishers.ofMultipartFormData(HttpFormDataUtils.toMap(request), boundary)), BodyHandlers.ofString());
		return validateAndHandleHttpResponse(httpResponse, transformer);
	}

	@Override
	public CompletableFuture<String> sendAsync(AudioTranscriptionRequest request) throws IOException {
		// TODO Auto-generated method stub
		String boundary = HttpFormDataUtils.createMultipartBoundaryID();
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, za.co.sindi.commons.net.http.BodyPublishers.ofMultipartFormData(HttpFormDataUtils.toMap(request), boundary)), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> validateAndHandleHttpResponse(httpResponse, transformer)).toCompletableFuture();
	}

	@Override
	public String send(AudioTranslationRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String boundary = new BigInteger(256, ThreadLocalRandom.current()).toString();
		HttpResponse<Either<String, String>> httpResponse = send(createHttpRequestBuilder(request, za.co.sindi.commons.net.http.BodyPublishers.ofMultipartFormData(HttpFormDataUtils.toMap(request), boundary)), BodyHandlers.ofString());
		return validateAndHandleHttpResponse(httpResponse, transformer);
	}

	@Override
	public CompletableFuture<String> sendAsync(AudioTranslationRequest request) throws IOException {
		// TODO Auto-generated method stub
		String boundary = new BigInteger(256, ThreadLocalRandom.current()).toString();
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, za.co.sindi.commons.net.http.BodyPublishers.ofMultipartFormData(HttpFormDataUtils.toMap(request), boundary)), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> validateAndHandleHttpResponse(httpResponse, transformer)).toCompletableFuture();
	}

	@Override
	public ChatCompletion send(ChatCompletionRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getConversation()))), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ChatCompletion.class);
	}

	@Override
	public CompletableFuture<ChatCompletion> sendAsync(ChatCompletionRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getConversation()))), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ChatCompletion.class)).toCompletableFuture();
	}

	@Override
	public Stream<ChatCompletionChunk> sendStreaming(ChatCompletionRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//Must stream, regardless
		request.getConversation().setStream(true);
		AllEventsEventHandler sseEventHandler = new AllEventsEventHandler();
		HttpResponse<Either<Void, String>> httpResponse = send(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getConversation()))), BodyHandlers.fromLineSubscriber(new SSEEventSubscriber(sseEventHandler)));
		validateAndHandleHttpResponse(httpResponse, transformer);
		return handleStream(sseEventHandler.getEventStream(), transformer, ChatCompletionChunk.class);
	}

	@Override
	public CompletableFuture<Stream<ChatCompletionChunk>> sendAsyncStreaming(ChatCompletionRequest request) {
		// TODO Auto-generated method stub
		request.getConversation().setStream(true);
		AllEventsEventHandler sseEventHandler = new AllEventsEventHandler();
		CompletableFuture<HttpResponse<Either<Void, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getConversation()))), BodyHandlers.fromLineSubscriber(new SSEEventSubscriber(sseEventHandler)));
		return httpResponseFuture.thenApplyAsync(httpResponse -> { 
			validateAndHandleHttpResponse(httpResponse, transformer);
			return handleStream(sseEventHandler.getEventStream(), transformer, ChatCompletionChunk.class); 
		}).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.chat.GetChatCompletionRequest)
	 */
	@Override
	public ChatCompletion send(GetChatCompletionRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ChatCompletion.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.chat.GetChatCompletionRequest)
	 */
	@Override
	public CompletableFuture<ChatCompletion> sendAsync(GetChatCompletionRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ChatCompletion.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.chat.GetChatMessagesRequest)
	 */
	@Override
	public ChatCompletionMessageList send(GetChatMessagesRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ChatCompletionMessageList.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.chat.GetChatMessagesRequest)
	 */
	@Override
	public CompletableFuture<ChatCompletionMessageList> sendAsync(GetChatMessagesRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ChatCompletionMessageList.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.chat.ListChatCompletionsRequest)
	 */
	@Override
	public ChatCompletionList send(ListChatCompletionsRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ChatCompletionList.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.chat.ListChatCompletionsRequest)
	 */
	@Override
	public CompletableFuture<ChatCompletionList> sendAsync(ListChatCompletionsRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ChatCompletionList.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.chat.UpdateCompletionRequest)
	 */
	@Override
	public ChatCompletion send(UpdateCompletionRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getMetadata()))), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ChatCompletion.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.chat.UpdateCompletionRequest)
	 */
	@Override
	public CompletableFuture<ChatCompletion> sendAsync(UpdateCompletionRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getMetadata()))), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ChatCompletion.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.chat.DeleteChatCompletionRequest)
	 */
	@Override
	public DeletionStatus send(DeleteChatCompletionRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), DeletionStatus.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.chat.DeleteChatCompletionRequest)
	 */
	@Override
	public CompletableFuture<DeletionStatus> sendAsync(DeleteChatCompletionRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), DeletionStatus.class)).toCompletableFuture();
	}

	@Override
	public EmbeddingList send(CreateEmbeddingRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput()))), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), EmbeddingList.class);
	}

	@Override
	public CompletableFuture<EmbeddingList> sendAsync(CreateEmbeddingRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput()))), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), EmbeddingList.class)).toCompletableFuture();
	}

	@Override
	public FineTuningJob send(CreateFineTuningJobRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput()))), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), FineTuningJob.class);
	}

	@Override
	public CompletableFuture<FineTuningJob> sendAsync(CreateFineTuningJobRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput()))), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), FineTuningJob.class)).toCompletableFuture();
	}

	@Override
	public FineTuningJobList send(ListFineTuningJobRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), FineTuningJobList.class);
	}

	@Override
	public CompletableFuture<FineTuningJobList> sendAsync(ListFineTuningJobRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), FineTuningJobList.class)).toCompletableFuture();
	}

	@Override
	public FineTuningEventList send(ListFineTuningEventRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), FineTuningEventList.class);
	}

	@Override
	public CompletableFuture<FineTuningEventList> sendAsync(ListFineTuningEventRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), FineTuningEventList.class)).toCompletableFuture();
	}

	@Override
	public FineTuningJob send(RetrieveFineTuningJobRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), FineTuningJob.class);
	}

	@Override
	public CompletableFuture<FineTuningJob> sendAsync(RetrieveFineTuningJobRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), FineTuningJob.class)).toCompletableFuture();
	}

	@Override
	public FineTuningJob send(CancelFineTuningJobRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), FineTuningJob.class);
	}

	@Override
	public CompletableFuture<FineTuningJob> sendAsync(CancelFineTuningJobRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), FineTuningJob.class)).toCompletableFuture();
	}

	@Override
	public File send(UploadFileRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String boundary = HttpFormDataUtils.createMultipartBoundaryID();
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, za.co.sindi.commons.net.http.BodyPublishers.ofMultipartFormData(HttpFormDataUtils.toMap(request), boundary)), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), File.class);
	}

	@Override
	public CompletableFuture<File> sendAsync(UploadFileRequest request) throws IOException {
		// TODO Auto-generated method stub
		String boundary = HttpFormDataUtils.createMultipartBoundaryID();
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, za.co.sindi.commons.net.http.BodyPublishers.ofMultipartFormData(HttpFormDataUtils.toMap(request), boundary)), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), File.class)).toCompletableFuture();
	}

	@Override
	public FileList send(ListFileRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), FileList.class);
	}

	@Override
	public CompletableFuture<FileList> sendAsync(ListFileRequest request) throws IOException {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), FileList.class)).toCompletableFuture();
	}

	@Override
	public File send(RetrieveFileRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), File.class);
	}

	@Override
	public CompletableFuture<File> sendAsync(RetrieveFileRequest request) throws IOException {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), File.class)).toCompletableFuture();
	}

	@Override
	public DeletionStatus send(DeleteFileRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), DeletionStatus.class);
	}

	@Override
	public CompletableFuture<DeletionStatus> sendAsync(DeleteFileRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), DeletionStatus.class)).toCompletableFuture();
	}

	@Override
	public Path send(RetrieveFileContentRequest request, Path ofPath) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<Path, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofFile(ofPath));
		return validateAndHandleHttpResponse(httpResponse, transformer);
	}

	@Override
	public CompletableFuture<Path> sendAsync(RetrieveFileContentRequest request, Path ofPath) throws IOException {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<Path, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofFile(ofPath));
		return httpResponseFuture.thenApplyAsync(httpResponse -> validateAndHandleHttpResponse(httpResponse, transformer)).toCompletableFuture();
	}

	@Override
	public Image send(ImageRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getPrompt()))), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Image.class);
	}

	@Override
	public CompletableFuture<Image> sendAsync(ImageRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getPrompt()))), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Image.class)).toCompletableFuture();
	}

	@Override
	public ImageList send(ImageEditRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String boundary = HttpFormDataUtils.createMultipartBoundaryID();
		HttpResponse<Either<String, String>> httpResponse = send(createHttpRequestBuilder(request, za.co.sindi.commons.net.http.BodyPublishers.ofMultipartFormData(HttpFormDataUtils.toMap(request), boundary)), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ImageList.class);
	}

	@Override
	public CompletableFuture<ImageList> sendAsync(ImageEditRequest request) throws IOException {
		// TODO Auto-generated method stub
		String boundary = HttpFormDataUtils.createMultipartBoundaryID();
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, za.co.sindi.commons.net.http.BodyPublishers.ofMultipartFormData(HttpFormDataUtils.toMap(request), boundary)), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ImageList.class)).toCompletableFuture();
	}

	@Override
	public ImageList send(ImageVariationRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String boundary = HttpFormDataUtils.createMultipartBoundaryID();
		HttpResponse<Either<String, String>> httpResponse = send(createHttpRequestBuilder(request, za.co.sindi.commons.net.http.BodyPublishers.ofMultipartFormData(HttpFormDataUtils.toMap(request), boundary)), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ImageList.class);
	}

	@Override
	public CompletableFuture<ImageList> sendAsync(ImageVariationRequest request) throws IOException {
		// TODO Auto-generated method stub
		String boundary = HttpFormDataUtils.createMultipartBoundaryID();
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, za.co.sindi.commons.net.http.BodyPublishers.ofMultipartFormData(HttpFormDataUtils.toMap(request), boundary)), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ImageList.class)).toCompletableFuture();
	}

	@Override
	public ModelList send(ListModelRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ModelList.class);
	}

	@Override
	public CompletableFuture<ModelList> sendAsync(ListModelRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), ModelList.class)).toCompletableFuture();
	}

	@Override
	public Model send(RetrieveModelRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Model.class);
	}

	@Override
	public CompletableFuture<Model> sendAsync(RetrieveModelRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Model.class)).toCompletableFuture();
	}

	@Override
	public DeletionStatus send(DeleteModelRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), DeletionStatus.class);
	}

	@Override
	public CompletableFuture<DeletionStatus> sendAsync(DeleteModelRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), DeletionStatus.class)).toCompletableFuture();
	}

	@Override
	public Moderation send(CreateModerationRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<InputStream, String>> httpResponse = send(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput()))), BodyHandlers.ofInputStream());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Moderation.class);
	}

	@Override
	public CompletableFuture<Moderation> sendAsync(CreateModerationRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<InputStream, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput()))), BodyHandlers.ofInputStream());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Moderation.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.assistants.CreateAssistantRequest)
	 */
	@Override
	public Assistant send(CreateAssistantRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(applyNewAssistant(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput())))), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Assistant.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.assistants.CreateAssistantRequest)
	 */
	@Override
	public CompletableFuture<Assistant> sendAsync(CreateAssistantRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(applyNewAssistant(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput())))), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Assistant.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.assistants.ListAssistantRequest)
	 */
	@Override
	public AssistantList send(ListAssistantRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(applyNewAssistant(createHttpRequestBuilder(request, null)), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), AssistantList.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.assistants.ListAssistantRequest)
	 */
	@Override
	public CompletableFuture<AssistantList> sendAsync(ListAssistantRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(applyNewAssistant(createHttpRequestBuilder(request, null)), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), AssistantList.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.assistants.RetrieveAssistantRequest)
	 */
	@Override
	public Assistant send(RetrieveAssistantRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(applyNewAssistant(createHttpRequestBuilder(request, null)), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Assistant.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.assistants.RetrieveAssistantRequest)
	 */
	@Override
	public CompletableFuture<Assistant> sendAsync(RetrieveAssistantRequest request) throws IOException {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(applyNewAssistant(createHttpRequestBuilder(request, null)), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Assistant.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.assistants.ModifyAssistantRequest)
	 */
	@Override
	public Assistant send(ModifyAssistantRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(applyNewAssistant(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput())))), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Assistant.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.assistants.ModifyAssistantRequest)
	 */
	@Override
	public CompletableFuture<Assistant> sendAsync(ModifyAssistantRequest request) throws IOException {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(applyNewAssistant(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput())))), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Assistant.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.assistants.DeleteAssistantRequest)
	 */
	@Override
	public DeletionStatus send(DeleteAssistantRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(applyNewAssistant(createHttpRequestBuilder(request, null)), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), DeletionStatus.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.assistants.DeleteAssistantRequest)
	 */
	@Override
	public CompletableFuture<DeletionStatus> sendAsync(DeleteAssistantRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(applyNewAssistant(createHttpRequestBuilder(request, null)), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), DeletionStatus.class)).toCompletableFuture();
	}
	
	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.VectorStores.CreateVectorStoreRequest)
	 */
	@Override
	public VectorStore send(CreateVectorStoreRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(applyNewAssistant(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput())))), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), VectorStore.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.VectorStores.CreateVectorStoreRequest)
	 */
	@Override
	public CompletableFuture<VectorStore> sendAsync(CreateVectorStoreRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(applyNewAssistant(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput())))), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), VectorStore.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.VectorStores.ListVectorStoreRequest)
	 */
	@Override
	public VectorStoreList send(ListVectorStoreRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(applyNewAssistant(createHttpRequestBuilder(request, null)), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), VectorStoreList.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.VectorStores.ListVectorStoreRequest)
	 */
	@Override
	public CompletableFuture<VectorStoreList> sendAsync(ListVectorStoreRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(applyNewAssistant(createHttpRequestBuilder(request, null)), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), VectorStoreList.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.VectorStores.RetrieveVectorStoreRequest)
	 */
	@Override
	public VectorStore send(RetrieveVectorStoreRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(applyNewAssistant(createHttpRequestBuilder(request, null)), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), VectorStore.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.VectorStores.RetrieveVectorStoreRequest)
	 */
	@Override
	public CompletableFuture<VectorStore> sendAsync(RetrieveVectorStoreRequest request) throws IOException {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(applyNewAssistant(createHttpRequestBuilder(request, null)), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), VectorStore.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.VectorStores.ModifyVectorStoreRequest)
	 */
	@Override
	public VectorStore send(ModifyVectorStoreRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(applyNewAssistant(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput())))), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), VectorStore.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.VectorStores.ModifyVectorStoreRequest)
	 */
	@Override
	public CompletableFuture<VectorStore> sendAsync(ModifyVectorStoreRequest request) throws IOException {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(applyNewAssistant(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput())))), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), VectorStore.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.VectorStores.DeleteVectorStoreRequest)
	 */
	@Override
	public DeletionStatus send(DeleteVectorStoreRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(applyNewAssistant(createHttpRequestBuilder(request, null)), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), DeletionStatus.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.VectorStores.DeleteVectorStoreRequest)
	 */
	@Override
	public CompletableFuture<DeletionStatus> sendAsync(DeleteVectorStoreRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(applyNewAssistant(createHttpRequestBuilder(request, null)), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), DeletionStatus.class)).toCompletableFuture();
	}
	
	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.response.CreateModelResponseRequest)
	 */
	@Override
	public Response send(CreateModelResponseRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput()))), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Response.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.response.CreateModelResponseRequest)
	 */
	@Override
	public CompletableFuture<Response> sendAsync(CreateModelResponseRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getInput()))), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Response.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.response.ListInputItemsRequest)
	 */
	@Override
	public InputItemList send(ListInputItemsRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), InputItemList.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.response.ListInputItemsRequest)
	 */
	@Override
	public CompletableFuture<InputItemList> sendAsync(ListInputItemsRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), InputItemList.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.response.GetModelResponseRequest)
	 */
	@Override
	public Response send(GetModelResponseRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Response.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.response.GetModelResponseRequest)
	 */
	@Override
	public CompletableFuture<Response> sendAsync(GetModelResponseRequest request) throws IOException {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), Response.class)).toCompletableFuture();
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#send(za.co.sindi.ai.openai.response.DeleteModelResponseRequest)
	 */
	@Override
	public DeletionStatus send(DeleteModelResponseRequest request) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		HttpResponse<Either<String, String>> httpResponse = send(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), DeletionStatus.class);
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIClient#sendAsync(za.co.sindi.ai.openai.response.DeleteModelResponseRequest)
	 */
	@Override
	public CompletableFuture<DeletionStatus> sendAsync(DeleteModelResponseRequest request) {
		// TODO Auto-generated method stub
		CompletableFuture<HttpResponse<Either<String, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, null), BodyHandlers.ofString());
		return httpResponseFuture.thenApplyAsync(httpResponse -> transformer.transform(validateAndHandleHttpResponse(httpResponse, transformer), DeletionStatus.class)).toCompletableFuture();
	}
}
