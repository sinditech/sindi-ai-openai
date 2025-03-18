/**
 * 
 */
package za.co.sindi.ai.openai.response;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create a model response</a>
 */
public class CreateModelResponseRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/responses";
	
	private ResponseInput input;
	
	/**
	 * @param input
	 */
	public CreateModelResponseRequest(final ResponseInput input) {
		this(URI, input);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param input
	 */
	public CreateModelResponseRequest(final String uri, ResponseInput input) {
		super("POST", uri, "application/json");
		// TODO Auto-generated constructor stub
		this.input = input;
	}

	/**
	 * @return the input
	 */
	public ResponseInput getInput() {
		return input;
	}
}
