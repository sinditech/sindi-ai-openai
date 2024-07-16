/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * 
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class ChatCompletionResponseFormat implements Serializable {

	@JsonbProperty("type")
	private ChatResponseFormat type;
	
	/**
	 * 
	 */
	public ChatCompletionResponseFormat() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the type
	 */
	public ChatResponseFormat getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ChatResponseFormat type) {
		this.type = type;
	}
}
