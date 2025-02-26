/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class FunctionTool extends Tool {
	
	@JsonbProperty
	private Function function;

	/**
	 * 
	 */
	public FunctionTool() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param function
	 */
	public FunctionTool(Function function) {
		super();
		this.function = Objects.requireNonNull(function);
	}

	/**
	 * @return the function
	 */
	public Function getFunction() {
		return function;
	}

	/**
	 * @param function the function to set
	 */
	public void setFunction(Function function) {
		this.function = function;
	}
}
