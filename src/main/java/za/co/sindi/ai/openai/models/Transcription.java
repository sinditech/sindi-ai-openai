package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 19 September 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/audio/verbose-json-object">The transcription object (Verbose JSON).</a>
 */
public class Transcription implements Serializable {

	@JsonbProperty
	private String language;
	
	@JsonbProperty
	private String duration;
	
	@JsonbProperty
	private String text;
	
	@JsonbProperty
	private Word[] words;
	
	@JsonbProperty
	private Segment[] segments;

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

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
	 * @return the words
	 */
	public Word[] getWords() {
		return words;
	}

	/**
	 * @param words the words to set
	 */
	public void setWords(Word[] words) {
		this.words = words;
	}

	/**
	 * @return the segments
	 */
	public Segment[] getSegments() {
		return segments;
	}

	/**
	 * @param segments the segments to set
	 */
	public void setSegments(Segment[] segments) {
		this.segments = segments;
	}
}
