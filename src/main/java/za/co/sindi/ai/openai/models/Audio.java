/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/audio">OpenAPI API reference documentation.</a>
 */
public class Audio implements Serializable {

	@JsonbProperty
	private AudioVoice voice;
	
	@JsonbProperty
	private AudioFormat format;

	/**
	 * @param voice
	 * @param format
	 */
	public Audio(AudioVoice voice, AudioFormat format) {
		super();
		this.voice = voice;
		this.format = format;
	}

	/**
	 * @return the voice
	 */
	public AudioVoice getVoice() {
		return voice;
	}

	/**
	 * @return the format
	 */
	public AudioFormat getFormat() {
		return format;
	}
}
