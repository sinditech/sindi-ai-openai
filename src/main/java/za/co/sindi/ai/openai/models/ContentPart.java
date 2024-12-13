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
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/create">OpenAI API reference documentation.</a>
 */
public class ContentPart implements Serializable {

	@JsonbProperty
	private String type;
	
	@JsonbProperty
	private String text;

	/**
	 * @param type
	 * @param text
	 */
	public ContentPart(String type, String text) {
		super();
		this.type = type;
		this.text = text;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
}
