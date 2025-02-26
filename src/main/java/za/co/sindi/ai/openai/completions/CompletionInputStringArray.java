/**
 * 
 */
package za.co.sindi.ai.openai.completions;

import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2024
 */
public class CompletionInputStringArray extends CompletionInput<String[]> {
	
	@JsonbProperty
	private String[] prompt;

	/**
	 * @param prompt
	 * @param model
	 */
	public CompletionInputStringArray(String[] prompt, String model) {
		super(model);
		// TODO Auto-generated constructor stub
		this.prompt = Objects.requireNonNull(prompt, "A prompt is required.");
	}

	@Override
	public String[] getPrompt() {
		// TODO Auto-generated method stub
		return prompt;
	}
}
