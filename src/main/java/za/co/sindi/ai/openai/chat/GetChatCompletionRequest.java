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
public class GetChatCompletionRequest extends OpenAIRequest {

	private static final String URI = "/chat/completions";

	/**
	 * @param completionId
	 */
	public GetChatCompletionRequest(final String completionId) {
		this(URI, completionId);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param model
	 */
	public GetChatCompletionRequest(final String uri, final String completionId) {
		super("GET", uri + "/" + Objects.requireNonNull(completionId));
		// TODO Auto-generated constructor stub
	}
}
