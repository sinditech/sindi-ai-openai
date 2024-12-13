/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class UserInputAudioContent extends UserContent {

	@JsonbProperty("input_audio")
	private InputAudio inputAudio;

	/**
	 * @param inputAudio
	 */
	public UserInputAudioContent(InputAudio inputAudio) {
		super();
		this.inputAudio = Objects.requireNonNull(inputAudio, "An input audio is required.");
	}

	/**
	 * @return the inputAudio
	 */
	public InputAudio getInputAudio() {
		return inputAudio;
	}
}
