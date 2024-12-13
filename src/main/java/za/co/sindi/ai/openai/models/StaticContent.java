/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * 
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/create#chat-create-prediction">OpenAI API reference documentation.</a>
 */
public abstract class StaticContent<T> implements Serializable {

	@JsonbProperty
	private String type = "content";

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
	 * @return the content
	 */
	public abstract T getContent();

	/**
	 * @param content the content to set
	 */
	public abstract void setContent(T content);
}
