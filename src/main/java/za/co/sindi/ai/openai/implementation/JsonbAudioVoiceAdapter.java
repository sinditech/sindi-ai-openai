/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.AudioVoice;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbAudioVoiceAdapter implements JsonbAdapter<AudioVoice, String> {

	@Override
	public String adaptToJson(AudioVoice voice) throws Exception {
		// TODO Auto-generated method stub
		if (voice == null) return null;
		return voice.toString();
	}

	@Override
	public AudioVoice adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return AudioVoice.of(value);
	}
}
