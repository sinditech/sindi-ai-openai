/**
 * 
 */
package za.co.sindi.ai.openai.assistants;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class RetrieveAssistantRequest extends OpenAIRequest {

	private static final String URI = "/assistants";

	/**
	 * @param assistantId
	 */
	public RetrieveAssistantRequest(final String assistantId) {
		this(URI, assistantId);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param assistantId
	 */
	public RetrieveAssistantRequest(final String uri, final String assistantId) {
		super("GET", uri + "/" + assistantId);
		// TODO Auto-generated constructor stub
	}
}
