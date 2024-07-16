/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/moderations">OpenAI API reference documentation.</a>
 */
public abstract class ModerationInput<T extends Serializable> implements Serializable {
	
	@JsonbProperty
	private ModerationModelName model;
	
	/**
	 * 
	 */
	protected ModerationInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param model
	 */
	protected ModerationInput(ModerationModelName model) {
		super();
		this.model = Objects.requireNonNull(model, "'model' is required.");
	}

	/**
	 * @return the input
	 */
	public abstract T getInput();

	/**
	 * @param input the input to set
	 */
	public abstract void setInput(T input);
	
	/**
	 * @return the model
	 */
	public ModerationModelName getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(ModerationModelName model) {
		this.model = model;
	}
}
