/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class ChatChoiceChunk implements Serializable {
	
	@JsonbProperty
	private ChatResponseMessage delta;
	
	@JsonbProperty("logprobs")
	private LogProbability logProbs;
	
	@JsonbProperty("finish_reason")
	private String finishReason;
	
	@JsonbProperty
	private Integer index;

	/**
	 * 
	 */
	public ChatChoiceChunk() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param delta
	 * @param logProbs
	 * @param finishReason
	 * @param index
	 */
	public ChatChoiceChunk(ChatResponseMessage delta, LogProbability logProbs, String finishReason, Integer index) {
		super();
		this.delta = delta;
		this.logProbs = logProbs;
		this.finishReason = finishReason;
		this.index = index;
	}

	/**
	 * @return the delta
	 */
	public ChatResponseMessage getDelta() {
		return delta;
	}

	/**
	 * @param delta the delta to set
	 */
	public void setDelta(ChatResponseMessage delta) {
		this.delta = delta;
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
}
