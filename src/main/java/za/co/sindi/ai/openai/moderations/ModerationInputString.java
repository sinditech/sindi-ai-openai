/**
 * 
 */
package za.co.sindi.ai.openai.moderations;

import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.openai.models.ModerationModelName;

/**
 * @author Buhake Sindi
 * @since 24 February 2024
 * @see <a href="https://platform.openai.com/docs/models/embeddings">Embeddings</a>
 */
public class ModerationInputString extends ModerationInput<String> {
	
	@JsonbProperty
	private String input;

	/**
	 * 
	 */
	public ModerationInputString() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param input
	 * @param model
	 */
	public ModerationInputString(String input, ModerationModelName model) {
		super(model);
		// TODO Auto-generated constructor stub
		this.input = Objects.requireNonNull(input, "'input' is required.");
	}

	@Override
	public String getInput() {
		// TODO Auto-generated method stub
		return input;
	}

	public void setInput(String input) {
		// TODO Auto-generated method stub
		this.input = input;
	}
}
