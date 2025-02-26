/**
 * 
 */
package za.co.sindi.ai.openai;

import java.io.IOException;
import java.net.ProxySelector;
import java.nio.file.Path;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

import za.co.sindi.ai.openai.assistants.CreateAssistantRequest;
import za.co.sindi.ai.openai.assistants.DeleteAssistantRequest;
import za.co.sindi.ai.openai.assistants.ListAssistantRequest;
import za.co.sindi.ai.openai.assistants.ModifyAssistantRequest;
import za.co.sindi.ai.openai.assistants.RetrieveAssistantRequest;
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
import za.co.sindi.ai.openai.models.Assistant;
import za.co.sindi.ai.openai.models.AssistantList;
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

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 */
public interface OpenAIClient {
	
	/**
	 * @param connectionTimeout the connectionTimeout to set
	 */
	public void setConnectionTimeout(Duration connectionTimeout);

	/**
	 * @param proxy the proxy to set
	 */
	public void setProxy(ProxySelector proxy);

	/**
	 * @param executor the executor to set
	 */
	public void setExecutor(Executor executor);
	
	// ------------------- Completion -------------------
	public Completion send(final CompletionRequest request) throws IOException, InterruptedException;
	public CompletableFuture<Completion> sendAsync(final CompletionRequest request);
	
	// ------------------- Audio -------------------
	public Path send(final AudioSpeechRequest request, final Path ofPath) throws IOException, InterruptedException;
	public CompletableFuture<Path> sendAsync(final AudioSpeechRequest request, final Path ofPath);
	public String send(final AudioTranscriptionRequest request) throws IOException, InterruptedException;
	public CompletableFuture<String> sendAsync(final AudioTranscriptionRequest request) throws IOException;
	public String send(final AudioTranslationRequest request) throws IOException, InterruptedException;
	public CompletableFuture<String> sendAsync(final AudioTranslationRequest request) throws IOException;
	
	// ------------------- Chat -------------------
	public ChatCompletion send(final ChatCompletionRequest request) throws IOException, InterruptedException;
	public CompletableFuture<ChatCompletion> sendAsync(final ChatCompletionRequest request);
	public Stream<ChatCompletionChunk> sendStreaming(final ChatCompletionRequest request) throws IOException, InterruptedException;
	public CompletableFuture<Stream<ChatCompletionChunk>> sendAsyncStreaming(final ChatCompletionRequest request);
	
	// ------------------- Embeddings -------------------
	public EmbeddingList send(final CreateEmbeddingRequest request) throws IOException, InterruptedException;
	public CompletableFuture<EmbeddingList> sendAsync(final CreateEmbeddingRequest request);
	
	// ------------------- Fine-Tuning -------------------
	public FineTuningJob send(final CreateFineTuningJobRequest request) throws IOException, InterruptedException;
	public CompletableFuture<FineTuningJob> sendAsync(final CreateFineTuningJobRequest request);
	public FineTuningJobList send(final ListFineTuningJobRequest request) throws IOException, InterruptedException;
	public CompletableFuture<FineTuningJobList> sendAsync(final ListFineTuningJobRequest request);
	public FineTuningEventList send(final ListFineTuningEventRequest request) throws IOException, InterruptedException;
	public CompletableFuture<FineTuningEventList> sendAsync(final ListFineTuningEventRequest request);
	public FineTuningJob send(final RetrieveFineTuningJobRequest request) throws IOException, InterruptedException;
	public CompletableFuture<FineTuningJob> sendAsync(final RetrieveFineTuningJobRequest request);
	public FineTuningJob send(final CancelFineTuningJobRequest request) throws IOException, InterruptedException;
	public CompletableFuture<FineTuningJob> sendAsync(final CancelFineTuningJobRequest request);

	// ------------------- Files -------------------
	public File send(final UploadFileRequest request) throws IOException, InterruptedException;
	public CompletableFuture<File> sendAsync(final UploadFileRequest request) throws IOException;
	public FileList send(final ListFileRequest request) throws IOException, InterruptedException;
	public CompletableFuture<FileList> sendAsync(final ListFileRequest request) throws IOException;
	public File send(final RetrieveFileRequest request) throws IOException, InterruptedException;
	public CompletableFuture<File> sendAsync(final RetrieveFileRequest request) throws IOException;
	public DeletionStatus send(final DeleteFileRequest request) throws IOException, InterruptedException;
	public CompletableFuture<DeletionStatus> sendAsync(final DeleteFileRequest request);
	public Path send(final RetrieveFileContentRequest request, Path ofPath) throws IOException, InterruptedException;
	public CompletableFuture<Path> sendAsync(final RetrieveFileContentRequest request, Path ofPath) throws IOException;
	
	// ------------------- Images -------------------
	public Image send(final ImageRequest request) throws IOException, InterruptedException;
	public CompletableFuture<Image> sendAsync(final ImageRequest request);
	public ImageList send(final ImageEditRequest request) throws IOException, InterruptedException;
	public CompletableFuture<ImageList> sendAsync(final ImageEditRequest request) throws IOException;
	public ImageList send(final ImageVariationRequest request) throws IOException, InterruptedException;
	public CompletableFuture<ImageList> sendAsync(final ImageVariationRequest request) throws IOException;
	
	// ------------------- Models -------------------
	public ModelList send(final ListModelRequest request) throws IOException, InterruptedException;
	public CompletableFuture<ModelList> sendAsync(final ListModelRequest request);
	public Model send(final RetrieveModelRequest request) throws IOException, InterruptedException;
	public CompletableFuture<Model> sendAsync(final RetrieveModelRequest request);
	public DeletionStatus send(final DeleteModelRequest request) throws IOException, InterruptedException;
	public CompletableFuture<DeletionStatus> sendAsync(final DeleteModelRequest request);
	
	// ------------------- Moderation -------------------
	public Moderation send(final CreateModerationRequest request) throws IOException, InterruptedException;
	public CompletableFuture<Moderation> sendAsync(final CreateModerationRequest request);
	
	// ------------------- Assistants -------------------
	public Assistant send(final CreateAssistantRequest request) throws IOException, InterruptedException;
	public CompletableFuture<Assistant> sendAsync(final CreateAssistantRequest request);
	public AssistantList send(final ListAssistantRequest request) throws IOException, InterruptedException;
	public CompletableFuture<AssistantList> sendAsync(final ListAssistantRequest request);
	public Assistant send(final RetrieveAssistantRequest request) throws IOException, InterruptedException;
	public CompletableFuture<Assistant> sendAsync(final RetrieveAssistantRequest request) throws IOException;
	public Assistant send(final ModifyAssistantRequest request) throws IOException, InterruptedException;
	public CompletableFuture<Assistant> sendAsync(final ModifyAssistantRequest request) throws IOException;
	public DeletionStatus send(final DeleteAssistantRequest request) throws IOException, InterruptedException;
	public CompletableFuture<DeletionStatus> sendAsync(final DeleteAssistantRequest request);
}

