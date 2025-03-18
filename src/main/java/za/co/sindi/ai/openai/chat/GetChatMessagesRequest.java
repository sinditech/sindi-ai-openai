/**
 * 
 */
package za.co.sindi.ai.openai.chat;

import java.util.Objects;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class GetChatMessagesRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/chat/completions";

	/**
	 * @param completionId
	 */
	public GetChatMessagesRequest(final String completionId) {
		this(URI, completionId);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param model
	 */
	public GetChatMessagesRequest(final String uri, final String completionId) {
		super("GET", uri + "/" + Objects.requireNonNull(completionId) + "/messages");
		// TODO Auto-generated constructor stub
	}
}
