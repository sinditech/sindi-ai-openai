/**
 * 
 */
package za.co.sindi.ai.openai.completions;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.ai.openai.models.CompletionInput;
import za.co.sindi.ai.openai.models.CompletionInputString;
import za.co.sindi.ai.openai.models.CompletionInputStringArray;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class CompletionRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/completions";
	
	private CompletionInput<?> input;
	
	/**
	 * 
	 * @param prompt
	 * @param model
	 */
	public CompletionRequest(final String prompt, final String model) {
		this(new CompletionInputString(prompt, model));
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param uri
	 * @param prompt
	 * @param model
	 */
	public CompletionRequest(final String uri, final String prompt, final String model) {
		this(uri, new CompletionInputString(prompt, model));
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param prompt
	 * @param model
	 */
	public CompletionRequest(final String[] prompt, final String model) {
		this(new CompletionInputStringArray(prompt, model));
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param uri
	 * @param prompt
	 * @param model
	 */
	public CompletionRequest(final String uri, final String[] prompt, final String model) {
		this(uri, new CompletionInputStringArray(prompt, model));
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param input
	 */
	public CompletionRequest(final CompletionInput<?> input) {
		this(URI, input);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param input
	 */
	public CompletionRequest(final String uri, final CompletionInput<?> input) {
		super("POST", uri, "application/json");
		// TODO Auto-generated constructor stub
		this.input = input;
	}

	/**
	 * @return the input
	 */
	public CompletionInput<?> getInput() {
		return input;
	}
}
