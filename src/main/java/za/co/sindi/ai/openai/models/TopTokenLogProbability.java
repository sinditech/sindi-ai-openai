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
public class TopTokenLogProbability implements Serializable {

	@JsonbProperty
	private String token;
	
	@JsonbProperty("logprob")
	private Double logProbability;
	
	@JsonbProperty
	private byte[] bytes;

	/**
	 * @param token
	 * @param logProbability
	 * @param bytes
	 */
	public TopTokenLogProbability(String token, Double logProbability, byte[] bytes) {
		super();
		this.token = token;
		this.logProbability = logProbability;
		this.bytes = bytes;
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
}
