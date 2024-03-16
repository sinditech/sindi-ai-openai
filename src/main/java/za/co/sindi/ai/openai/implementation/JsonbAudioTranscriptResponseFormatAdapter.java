/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.AudioTranscriptResponseFormat;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbAudioTranscriptResponseFormatAdapter implements JsonbAdapter<AudioTranscriptResponseFormat, String> {

	@Override
	public String adaptToJson(AudioTranscriptResponseFormat format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public AudioTranscriptResponseFormat adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return AudioTranscriptResponseFormat.of(value);
	}
}
