/**
 * 
 */
package za.co.sindi.ai.openai.chat;

import java.util.List;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.ai.openai.models.ChatConversation;
import za.co.sindi.ai.openai.models.ChatRequestMessage;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class ChatCompletionRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/chat/completions";
	
	private ChatConversation conversation;
	
	/**
	 * 
	 * @param messages
	 * @param model
	 */
	public ChatCompletionRequest(final List<ChatRequestMessage<?>> messages, final String model) {
		this(new ChatConversation(messages, model));
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param uri
	 * @param messages
	 * @param model
	 */
	public ChatCompletionRequest(final String uri, final List<ChatRequestMessage<?>> messages, final String model) {
		this(uri, new ChatConversation(messages, model));
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param conversation
	 */
	public ChatCompletionRequest(final ChatConversation conversation) {
		this(URI, conversation);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param conversation
	 */
	public ChatCompletionRequest(final String uri, final ChatConversation conversation) {
		super("POST", uri, "application/json");
		// TODO Auto-generated constructor stub
		this.conversation = conversation;
	}

	/**
	 * @return the conversation
	 */
	public ChatConversation getConversation() {
		return conversation;
	}
}
