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
public class ContentTokenProbability implements Serializable {

	@JsonbProperty
	private String token;
	
	@JsonbProperty("logprob")
	private Double logProbability;
	
	@JsonbProperty
	private byte[] bytes;
	
	@JsonbProperty("top_logprobs")
	private TopContentTokenProbability[] topLogProbabilities;

	/**
	 * @param token
	 * @param logProbability
	 * @param bytes
	 * @param topLogProbabilities
	 */
	public ContentTokenProbability(String token, Double logProbability, byte[] bytes,
			TopContentTokenProbability[] topLogProbabilities) {
		super();
		this.token = token;
		this.logProbability = logProbability;
		this.bytes = bytes;
		this.topLogProbabilities = topLogProbabilities;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @return the logProbability
	 */
	public Double getLogProbability() {
		return logProbability;
	}

	/**
	 * @return the bytes
	 */
	public byte[] getBytes() {
		return bytes;
	}

	/**
	 * @return the topLogProbabilities
	 */
	public TopContentTokenProbability[] getTopLogProbabilities() {
		return topLogProbabilities;
	}
}
