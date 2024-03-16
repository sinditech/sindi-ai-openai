/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/completions/object">OpenAPI API reference documentation.</a>
 */
public class CompletionChoice implements Serializable {

	@JsonbProperty("finish_reason")
	private String finishReason;
	
	@JsonbProperty
	private Integer index;
	
	@JsonbProperty
	private String text;
	
	@JsonbProperty("logprobs")
	private LogProbability logProbs;

	/**
	 * 
	 */
	public CompletionChoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param finishReason
	 * @param index
	 * @param text
	 * @param logProbs
	 */
	public CompletionChoice(String finishReason, Integer index, String text, LogProbability logProbs) {
		super();
		this.finishReason = finishReason;
		this.index = index;
		this.text = text;
		this.logProbs = logProbs;
	}

	/**
	 * @return the finishReason
	 */
	public String getFinishReason() {
		return finishReason;
	}

	/**
	 * @param finishReason the finishReason to set
	 */
	public void setFinishReason(String finishReason) {
		this.finishReason = finishReason;
	}

	/**
	 * @return the index
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(Integer index) {
		this.index = index;
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
	 * @return the logProbs
	 */
	public LogProbability getLogProbs() {
		return logProbs;
	}

	/**
	 * @param logProbs the logProbs to set
	 */
	public void setLogProbs(LogProbability logProbs) {
		this.logProbs = logProbs;
	}
}
