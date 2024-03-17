/**
 * 
 */
package za.co.sindi.ai.openai;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import za.co.sindi.ai.openai.models.ChatCompletion;
import za.co.sindi.ai.openai.models.ChatConversation;
import za.co.sindi.ai.openai.models.Completion;
import za.co.sindi.ai.openai.models.CompletionInput;
import za.co.sindi.ai.openai.models.EmbeddingInput;
import za.co.sindi.ai.openai.models.EmbeddingList;

/**
 * @author Buhake Sindi
 * @since 25 January 2024
 */
public interface OpenAIService {

	public Completion createCompletion(final CompletionInput<?> completionInput) throws IOException, InterruptedException;
	
	public CompletableFuture<Completion> createCompletionAsync(final CompletionInput<?> completionInput);
	
	public EmbeddingList createEmbedding(final EmbeddingInput<?> input) throws IOException, InterruptedException;
	
	public CompletableFuture<EmbeddingList> createEmbeddingAsync(final EmbeddingInput<?> input);
	
	public ChatCompletion createChatCompletion(final ChatConversation conversation) throws IOException, InterruptedException;
	
	public CompletableFuture<ChatCompletion> createChatCompletionAsync(final ChatConversation conversation);
}
