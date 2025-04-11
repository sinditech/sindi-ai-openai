/**
 * 
 */
package za.co.sindi.ai.openai.audio;

import java.util.Objects;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.ai.openai.models.AudioSpeech;
import za.co.sindi.ai.openai.models.TTSModel;
import za.co.sindi.ai.openai.models.TTSVoiceOption;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class AudioSpeechRequest extends OpenAIRequest {

	private static final String URI = "/audio/speech";
	
	private AudioSpeech speech;
	
	/**
	 * 
	 * @param model
	 * @param input
	 * @param voice
	 */
	public AudioSpeechRequest(final TTSModel model, final String input, final TTSVoiceOption voice) {
		this(new AudioSpeech(model, input, voice));
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param speech
	 */
	public AudioSpeechRequest(final AudioSpeech speech) {
		this(URI, speech);
		// TODO Auto-generated constructor stub
		this.speech = Objects.requireNonNull(speech, "An audio speech is required.");
	}

	/**
	 * @param uri
	 * @param speech
	 */
	public AudioSpeechRequest(String uri, final AudioSpeech speech) {
		super("POST", uri, "application/json");
		this.speech = speech;
	}

	/**
	 * @return the speech
	 */
	public AudioSpeech getSpeech() {
		return speech;
	}
}
