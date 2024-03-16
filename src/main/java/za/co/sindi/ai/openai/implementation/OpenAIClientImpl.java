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
import za.co.sindi.ai.openai.audio.AudioSpeechRequest;
import za.co.sindi.ai.openai.audio.AudioTranscriptionRequest;
import za.co.sindi.ai.openai.audio.AudioTranslationRequest;
import za.co.sindi.ai.openai.chat.ChatCompletionRequest;
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
import za.co.sindi.ai.openai.models.ChatCompletion;
import za.co.sindi.ai.openai.models.ChatCompletionChunk;
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
import za.co.sindi.ai.openai.models.Model;
import za.co.sindi.ai.openai.models.ModelList;
import za.co.sindi.ai.openai.models.Moderation;
import za.co.sindi.ai.openai.moderations.CreateModerationRequest;
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
		if (request.getConversation().getStream() == null || !Boolean.TRUE.equals(request.getConversation().getStream())) {
			request.getConversation().setStream(true);
		}
		HttpResponse<Either<Stream<String>, String>> httpResponse = send(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getConversation()))), BodyHandlers.ofLines());
		return handleStream(validateAndHandleHttpResponse(httpResponse, transformer), transformer, ChatCompletionChunk.class);
	}

	@Override
	public CompletableFuture<Stream<ChatCompletionChunk>> sendAsyncStreaming(ChatCompletionRequest request) {
		// TODO Auto-generated method stub
		if (request.getConversation().getStream() == null || !Boolean.TRUE.equals(request.getConversation().getStream())) {
			request.getConversation().setStream(true);
		}
		CompletableFuture<HttpResponse<Either<Stream<String>, String>>> httpResponseFuture = sendAsync(createHttpRequestBuilder(request, BodyPublishers.ofString(transformer.transform(request.getConversation()))), BodyHandlers.ofLines());
		return httpResponseFuture.thenApplyAsync(httpResponse -> handleStream(validateAndHandleHttpResponse(httpResponse, transformer), transformer, ChatCompletionChunk.class)).toCompletableFuture();
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
}
