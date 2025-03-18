/**
 * 
 */
package za.co.sindi.ai.openai.chat;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class ToolChoice implements Serializable {
	
	@JsonbProperty
	private ToolChoiceFunction function;
	
	@JsonbProperty
	private String type = "type";

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
}
