/**
 * 
 */
package za.co.sindi.ai.openai.assistants;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class ModifyAssistantRequest extends OpenAIRequest {

	private static final String URI = "/assistants";
	
	private AssistantInput input;
	
	/**
	 * @param assistantId
	 * @param input
	 */
	public ModifyAssistantRequest(final String assistantId, final AssistantInput input) {
		this(URI, assistantId, input);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param input
	 */
	public ModifyAssistantRequest(final String uri, final String assistantId, AssistantInput input) {
		super("POST", uri + "/" + assistantId, "application/json");
		// TODO Auto-generated constructor stub
		this.input = input;
	}

	/**
	 * @return the input
	 */
	public AssistantInput getInput() {
		return input;
	}
}
