/**
 * 
 */
package za.co.sindi.ai.openai.response;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/delete">Delete a model response</a>
 */
public class DeleteModelResponseRequest extends OpenAIRequest {

	private static final String URI = "/responses";
	
	/**
	 * @param responseId
	 */
	public DeleteModelResponseRequest(final String responseId) {
		this(URI, responseId);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param responseId
	 */
	public DeleteModelResponseRequest(final String uri, final String responseId) {
		super("DELETE", uri + "/" + responseId);
		// TODO Auto-generated constructor stub
	}
}
