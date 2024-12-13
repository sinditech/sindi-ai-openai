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
public class ToolChoiceFunction implements Serializable {

	@JsonbProperty
	private String name;
	
	/**
	 * @param name
	 */
	public ToolChoiceFunction(String name) {
		super();
		this.name = Objects.requireNonNull(name);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
