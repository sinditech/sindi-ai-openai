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
public class Segment implements Serializable {
	
	@JsonbProperty
	private Integer id;
	
	@JsonbProperty
	private Integer seek;
	
	@JsonbProperty
	private Double start;
	
	@JsonbProperty
	private Double end;
	
	@JsonbProperty
	private String text;
	
	@JsonbProperty
	private int[] tokens;
	
	@JsonbProperty
	private Double temperature;
	
	@JsonbProperty("avg_logprob")
	private Double averageLogprob;
	
	@JsonbProperty("compression_ratio")
	private Double compressionRatio;
	
	@JsonbProperty("no_speech_prob")
	private Double noSpeechProbability;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the seek
	 */
	public Integer getSeek() {
		return seek;
	}

	/**
	 * @param seek the seek to set
	 */
	public void setSeek(Integer seek) {
		this.seek = seek;
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
	 * @return the tokens
	 */
	public int[] getTokens() {
		return tokens;
	}

	/**
	 * @param tokens the tokens to set
	 */
	public void setTokens(int[] tokens) {
		this.tokens = tokens;
	}

	/**
	 * @return the temperature
	 */
	public Double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the averageLogprob
	 */
	public Double getAverageLogprob() {
		return averageLogprob;
	}

	/**
	 * @param averageLogprob the averageLogprob to set
	 */
	public void setAverageLogprob(Double averageLogprob) {
		this.averageLogprob = averageLogprob;
	}

	/**
	 * @return the compressionRatio
	 */
	public Double getCompressionRatio() {
		return compressionRatio;
	}

	/**
	 * @param compressionRatio the compressionRatio to set
	 */
	public void setCompressionRatio(Double compressionRatio) {
		this.compressionRatio = compressionRatio;
	}

	/**
	 * @return the noSpeechProbability
	 */
	public Double getNoSpeechProbability() {
		return noSpeechProbability;
	}

	/**
	 * @param noSpeechProbability the noSpeechProbability to set
	 */
	public void setNoSpeechProbability(Double noSpeechProbability) {
		this.noSpeechProbability = noSpeechProbability;
	}
}
