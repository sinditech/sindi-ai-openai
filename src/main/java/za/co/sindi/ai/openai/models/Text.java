/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class Text implements Serializable {

	@JsonbProperty
	private ResponseFormat format;

	/**
	 * @return the format
	 */
	public ResponseFormat getFormat() {
		return format;
	}

	/**
	 * @param format the format to set
	 */
	public void setFormat(ResponseFormat format) {
		this.format = format;
	}
}
