/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 18 September 2024
 */
public class CompletionTokensDetails implements Serializable {
	
	@JsonbProperty("accepted_prediction_tokens")
	private Integer acceptedPredictionTokens;
	
	@JsonbProperty("audio_tokens")
	private Integer audioTokens;

	@JsonbProperty("reasoning_tokens")
	private Integer reasoningTokens;
	
	@JsonbProperty("rejected_prediction_tokens")
	private Integer rejectedPredictionTokens;

	/**
	 * @return the acceptedPredictionTokens
	 */
	public Integer getAcceptedPredictionTokens() {
		return acceptedPredictionTokens;
	}

	/**
	 * @param acceptedPredictionTokens the acceptedPredictionTokens to set
	 */
	public void setAcceptedPredictionTokens(Integer acceptedPredictionTokens) {
		this.acceptedPredictionTokens = acceptedPredictionTokens;
	}

	/**
	 * @return the audioTokens
	 */
	public Integer getAudioTokens() {
		return audioTokens;
	}

	/**
	 * @param audioTokens the audioTokens to set
	 */
	public void setAudioTokens(Integer audioTokens) {
		this.audioTokens = audioTokens;
	}

	/**
	 * @return the reasoningTokens
	 */
	public Integer getReasoningTokens() {
		return reasoningTokens;
	}

	/**
	 * @param reasoningTokens the reasoningTokens to set
	 */
	public void setReasoningTokens(Integer reasoningTokens) {
		this.reasoningTokens = reasoningTokens;
	}

	/**
	 * @return the rejectedPredictionTokens
	 */
	public Integer getRejectedPredictionTokens() {
		return rejectedPredictionTokens;
	}

	/**
	 * @param rejectedPredictionTokens the rejectedPredictionTokens to set
	 */
	public void setRejectedPredictionTokens(Integer rejectedPredictionTokens) {
		this.rejectedPredictionTokens = rejectedPredictionTokens;
	}
}
