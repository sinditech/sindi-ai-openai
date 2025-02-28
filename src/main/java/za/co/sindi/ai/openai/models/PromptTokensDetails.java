/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 28 February 2025
 */
public class PromptTokensDetails implements Serializable {
	
	@JsonbProperty("audio_tokens")
	private Integer audioTokens;

	@JsonbProperty("cached_tokens")
	private Integer cachedTokens;

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
	 * @return the cachedTokens
	 */
	public Integer getCachedTokens() {
		return cachedTokens;
	}

	/**
	 * @param cachedTokens the cachedTokens to set
	 */
	public void setCachedTokens(Integer cachedTokens) {
		this.cachedTokens = cachedTokens;
	}
}
