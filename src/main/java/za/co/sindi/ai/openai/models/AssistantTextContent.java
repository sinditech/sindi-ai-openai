/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class AssistantTextContent extends UserContent {

	@JsonbProperty
	private String text;

	/**
	 * @param text
	 */
	public AssistantTextContent(String text) {
		super();
		this.text = Objects.requireNonNull(text, "A text is required.");
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
}
