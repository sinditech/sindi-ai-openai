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
public class ToolCallFunction implements Serializable {

	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private String arguments;

	/**
	 * @param name
	 * @param arguments
	 */
	public ToolCallFunction(String name, String arguments) {
		super();
		this.name = Objects.requireNonNull(name);
		this.arguments = Objects.requireNonNull(arguments);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the arguments
	 */
	public String getArguments() {
		return arguments;
	}
}
