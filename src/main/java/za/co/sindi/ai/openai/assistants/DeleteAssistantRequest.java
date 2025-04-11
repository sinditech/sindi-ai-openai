/**
 * 
 */
package za.co.sindi.ai.openai.assistants;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class DeleteAssistantRequest extends OpenAIRequest {

	private static final String URI = "/assistants";
	
	/**
	 * @param assistantId
	 */
	public DeleteAssistantRequest(final String assistantId) {
		this(URI, assistantId);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param assistantId
	 */
	public DeleteAssistantRequest(final String uri, final String assistantId) {
		super("DELETE", uri + "/" + assistantId);
		// TODO Auto-generated constructor stub
	}
}
