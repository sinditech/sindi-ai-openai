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
public class UsageStatistics implements Serializable {

	@JsonbProperty("completion_tokens")
	private Integer completionTokens;
	
	@JsonbProperty("prompt_tokens")
	private Integer promptTokens;
	
	@JsonbProperty("total_tokens")
	private Integer totalTokens;
	
	@JsonbProperty("completion_tokens_details")
	private CompletionTokensDetails completionTokensDetails;

	/**
	 * @return the completionTokens
	 */
	public Integer getCompletionTokens() {
		return completionTokens;
	}

	/**
	 * @param completionTokens the completionTokens to set
	 */
	public void setCompletionTokens(Integer completionTokens) {
		this.completionTokens = completionTokens;
	}

	/**
	 * @return the promptTokens
	 */
	public Integer getPromptTokens() {
		return promptTokens;
	}

	/**
	 * @param promptTokens the promptTokens to set
	 */
	public void setPromptTokens(Integer promptTokens) {
		this.promptTokens = promptTokens;
	}

	/**
	 * @return the totalTokens
	 */
	public Integer getTotalTokens() {
		return totalTokens;
	}

	/**
	 * @param totalTokens the totalTokens to set
	 */
	public void setTotalTokens(Integer totalTokens) {
		this.totalTokens = totalTokens;
	}
}
