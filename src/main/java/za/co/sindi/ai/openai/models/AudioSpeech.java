/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/audio">OpenAPI API reference documentation.</a>
 */
public class AudioSpeech implements Serializable {

	@JsonbProperty
	private TTSModel model;
	
	@JsonbProperty
	private String input;
	
	@JsonbProperty
	private TTSVoiceOption voice;
	
	@JsonbProperty("response_format")
	private AudioSpeechResponseFormat responseFormat;
	
	@JsonbProperty
	private Double speed;

	/**
	 * @param model
	 * @param input
	 * @param voice
	 */
	public AudioSpeech(TTSModel model, String input, TTSVoiceOption voice) {
		super();
		this.model = Objects.requireNonNull(model);
		this.input = Objects.requireNonNull(input);
		this.voice = Objects.requireNonNull(voice);
	}

	/**
	 * @return the responseFormat
	 */
	public AudioSpeechResponseFormat getResponseFormat() {
		return responseFormat;
	}

	/**
	 * @param responseFormat the responseFormat to set
	 */
	public void setResponseFormat(AudioSpeechResponseFormat responseFormat) {
		this.responseFormat = responseFormat;
	}

	/**
	 * @return the speed
	 */
	public Double getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	/**
	 * @return the model
	 */
	public TTSModel getModel() {
		return model;
	}

	/**
	 * @return the input
	 */
	public String getInput() {
		return input;
	}

	/**
	 * @return the voice
	 */
	public TTSVoiceOption getVoice() {
		return voice;
	}
}
