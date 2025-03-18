package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/message-list">Chat Completion Message List reference documentation.</a>
 */
public class Audio implements Serializable {

	@JsonbProperty
	private String data;
	
	@JsonbProperty("expires_at")
	private Integer expiresAt;
	
	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private String transcript;

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

	/**
	 * @return the expiresAt
	 */
	public Integer getExpiresAt() {
		return expiresAt;
	}

	/**
	 * @param expiresAt the expiresAt to set
	 */
	public void setExpiresAt(Integer expiresAt) {
		this.expiresAt = expiresAt;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the transcript
	 */
	public String getTranscript() {
		return transcript;
	}

	/**
	 * @param transcript the transcript to set
	 */
	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}
}
