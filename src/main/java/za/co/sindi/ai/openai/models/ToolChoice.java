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
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class ToolChoice implements Serializable {
	
	@JsonbProperty
	private String type;
	
	@JsonbProperty
	private ToolChoiceFunction function;

	/**
	 * 
	 */
	public ToolChoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param function
	 */
	public ToolChoice(ToolChoiceFunction function) {
		super();
		this.type = "function";
		this.function = Objects.requireNonNull(function);
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the function
	 */
	public ToolChoiceFunction getFunction() {
		return function;
	}

	/**
	 * @param function the function to set
	 */
	public void setFunction(ToolChoiceFunction function) {
		this.function = function;
	}
}
