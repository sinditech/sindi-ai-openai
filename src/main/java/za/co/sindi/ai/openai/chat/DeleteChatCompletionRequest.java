/**
 * 
 */
package za.co.sindi.ai.openai.chat;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class DeleteChatCompletionRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/chat/completions";
	
	/**
	 * @param completionId
	 */
	public DeleteChatCompletionRequest(final String completionId) {
		this(URI, completionId);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param completionId
	 */
	public DeleteChatCompletionRequest(final String uri, final String completionId) {
		super("DELETE", uri + "/" + completionId);
		// TODO Auto-generated constructor stub
	}
}
