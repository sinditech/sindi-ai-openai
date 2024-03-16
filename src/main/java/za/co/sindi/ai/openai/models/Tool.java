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
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAPI API reference documentation.</a>
 */
public class Tool implements Serializable {
	
	@JsonbProperty
	private String type;
	
	@JsonbProperty
	private Function function;

	/**
	 * 
	 */
	public Tool() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param function
	 */
	public Tool(Function function) {
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
