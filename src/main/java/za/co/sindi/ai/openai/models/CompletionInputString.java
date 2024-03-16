/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2024
 */
public class CompletionInputString extends CompletionInput<String> {

	@JsonbProperty
	private String prompt;
	
	/**
	 * @param prompt
	 * @param model
	 */
	public CompletionInputString(String prompt, String model) {
		super(model);
		// TODO Auto-generated constructor stub
		this.prompt = Objects.requireNonNull(prompt, "A prompt is required.");
	}

	@Override
	public String getPrompt() {
		// TODO Auto-generated method stub
		return prompt;
	}
}
