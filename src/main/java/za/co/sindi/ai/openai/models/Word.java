/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 19 September 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/audio/verbose-json-object">The transcription object (Verbose JSON).</a>
 */
public class Word implements Serializable {
	
	@JsonbProperty
	private String word;
	
	@JsonbProperty
	private Double start;
	
	@JsonbProperty
	private Double end;

	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}

	/**
	 * @return the start
	 */
	public Double getStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(Double start) {
		this.start = start;
	}

	/**
	 * @return the end
	 */
	public Double getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(Double end) {
		this.end = end;
	}
}
