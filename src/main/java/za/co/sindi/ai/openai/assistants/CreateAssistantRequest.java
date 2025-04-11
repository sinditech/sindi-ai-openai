/**
 * 
 */
package za.co.sindi.ai.openai.assistants;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class CreateAssistantRequest extends OpenAIRequest {

	private static final String URI = "/assistants";
	
	private AssistantInput input;
	
	/**
	 * @param input
	 */
	public CreateAssistantRequest(final AssistantInput input) {
		this(URI, input);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param input
	 */
	public CreateAssistantRequest(final String uri, AssistantInput input) {
		super("POST", uri, "application/json");
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
