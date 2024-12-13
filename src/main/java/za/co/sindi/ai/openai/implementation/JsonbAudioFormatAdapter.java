/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.AudioFormat;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbAudioFormatAdapter implements JsonbAdapter<AudioFormat, String> {

	@Override
	public String adaptToJson(AudioFormat format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public AudioFormat adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return AudioFormat.of(value);
	}
}
