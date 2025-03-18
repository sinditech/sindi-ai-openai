package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class TextOutputContent extends OutputContent {

	@JsonbProperty
	private String text;
	
	@JsonbProperty
	private Citation[] annotations;

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the annotations
	 */
	public Citation[] getAnnotations() {
		return annotations;
	}

	/**
	 * @param annotations the annotations to set
	 */
	public void setAnnotations(Citation[] annotations) {
		this.annotations = annotations;
	}
}
