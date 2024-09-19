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

	@JsonbProperty("reasoning_tokens")
	private Integer reasoningTokens;

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
}
