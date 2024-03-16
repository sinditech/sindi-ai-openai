/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAPI API reference documentation.</a>
 */
public class ChatChoice implements Serializable {

	@JsonbProperty("finish_reason")
	private String finishReason;
	
	@JsonbProperty
	private Integer index;
	
	@JsonbProperty
	private ChatResponseMessage message;
	
	@JsonbProperty("logprobs")
	private LogProbability logProbs;

	/**
	 * 
	 */
	public ChatChoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param finishReason
	 * @param index
	 * @param message
	 * @param logProbs
	 */
	public ChatChoice(String finishReason, Integer index, ChatResponseMessage message, LogProbability logProbs) {
		super();
		this.finishReason = finishReason;
		this.index = index;
		this.message = message;
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
	 * @return the message
	 */
	public ChatResponseMessage getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(ChatResponseMessage message) {
		this.message = message;
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
