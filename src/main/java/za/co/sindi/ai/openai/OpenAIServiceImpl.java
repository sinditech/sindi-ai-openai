/**
 * 
 */
package za.co.sindi.ai.openai;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import za.co.sindi.ai.openai.chat.ChatCompletionRequest;
import za.co.sindi.ai.openai.completions.CompletionRequest;
import za.co.sindi.ai.openai.embeddings.CreateEmbeddingRequest;
import za.co.sindi.ai.openai.implementation.OpenAIClientImpl;
import za.co.sindi.ai.openai.models.ChatCompletion;
import za.co.sindi.ai.openai.models.ChatConversation;
import za.co.sindi.ai.openai.models.Completion;
import za.co.sindi.ai.openai.models.CompletionInput;
import za.co.sindi.ai.openai.models.EmbeddingInput;
import za.co.sindi.ai.openai.models.EmbeddingList;

/**
 * @author Buhake Sindi
 * @since 17 March 2024
 */
public class OpenAIServiceImpl implements OpenAIService {
	
	private final OpenAIClient openAIClient;
	
	/**
	 * @param apiKey
	 */
	public OpenAIServiceImpl(final String apiKey) {
		openAIClient = new OpenAIClientImpl(apiKey);
	}
	
	/**
	 * @param apiKey
	 * @param organizationId
	 */
	public OpenAIServiceImpl(final String apiKey, final String organizationId) {
		openAIClient = new OpenAIClientImpl(apiKey, organizationId);
	}
	
	public Completion createCompletion(final CompletionInput<?> completionInput) throws IOException, InterruptedException {
		CompletionRequest request = new CompletionRequest(completionInput);
		return openAIClient.send(request);
	}
	
	public CompletableFuture<Completion> createCompletionAsync(final CompletionInput<?> completionInput) {
		CompletionRequest request = new CompletionRequest(completionInput);
		return openAIClient.sendAsync(request);
	}
	
	public EmbeddingList createEmbedding(final EmbeddingInput<?> input) throws IOException, InterruptedException {
		CreateEmbeddingRequest request = new CreateEmbeddingRequest(input);
		return openAIClient.send(request);
	}
	
	public CompletableFuture<EmbeddingList> createEmbeddingAsync(final EmbeddingInput<?> input) {
		CreateEmbeddingRequest request = new CreateEmbeddingRequest(input);
		return openAIClient.sendAsync(request);
	}
	
	public ChatCompletion createChatCompletion(final ChatConversation conversation) throws IOException, InterruptedException {
		ChatCompletionRequest request = new ChatCompletionRequest(conversation);
		return openAIClient.send(request);
	}
	
	public CompletableFuture<ChatCompletion> createChatCompletionAsync(final ChatConversation conversation) {
		ChatCompletionRequest request = new ChatCompletionRequest(conversation);
		return openAIClient.sendAsync(request);
	}
}
