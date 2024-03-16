/**
 * 
 */
package za.co.sindi.ai.openai.moderations;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.ai.openai.models.ModerationInput;
import za.co.sindi.ai.openai.models.ModerationInputString;
import za.co.sindi.ai.openai.models.ModerationInputStringArray;
import za.co.sindi.ai.openai.models.ModerationModelName;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class CreateModerationRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/moderations";
	
	private ModerationInput<?> input;
	
	/**
	 * @param input
	 * @param model
	 */
	public CreateModerationRequest(final String input, final ModerationModelName model) {
		this(new ModerationInputString(input, model));
	}
	
	/**
	 * @param uri
	 * @param input
	 * @param model
	 */
	public CreateModerationRequest(final String uri, final String input, final ModerationModelName model) {
		this(uri, new ModerationInputString(input, model));
	}
	
	/**
	 * @param input
	 * @param model
	 */
	public CreateModerationRequest(final String[] input, final ModerationModelName model) {
		this(new ModerationInputStringArray(input, model));
	}
	
	/**
	 * @param uri
	 * @param input
	 * @param model
	 */
	public CreateModerationRequest(final String uri, final String[] input, final ModerationModelName model) {
		this(uri, new ModerationInputStringArray(input, model));
	}

	/**
	 * @param input
	 */
	public CreateModerationRequest(final ModerationInput<?> input) {
		this(URI, input);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param input
	 */
	public CreateModerationRequest(final String uri, final ModerationInput<?> input) {
		super("POST", uri, "application/json");
		// TODO Auto-generated constructor stub
		this.input = input;
	}

	/**
	 * @return the input
	 */
	public ModerationInput<?> getInput() {
		return input;
	}
}
