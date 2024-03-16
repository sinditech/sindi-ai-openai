/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.AudioSpeechResponseFormat;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbAudioSpeechResponseFormatAdapter implements JsonbAdapter<AudioSpeechResponseFormat, String> {

	@Override
	public String adaptToJson(AudioSpeechResponseFormat format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public AudioSpeechResponseFormat adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return AudioSpeechResponseFormat.of(value);
	}
}
