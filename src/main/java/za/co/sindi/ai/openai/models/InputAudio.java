/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class InputAudio implements Serializable {

	@JsonbProperty
	private String data;
	
	@JsonbProperty
	private String format;

	/**
	 * @param data
	 * @param format
	 */
	public InputAudio(String data, String format) {
		super();
		this.data = Objects.requireNonNull(data, "A data is required.");;
		this.format = Objects.requireNonNull(format, "A format is required.");;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}
}
