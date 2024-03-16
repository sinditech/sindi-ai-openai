/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.ImageResponseFormat;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbImageResponseFormatAdapter implements JsonbAdapter<ImageResponseFormat, String> {

	@Override
	public String adaptToJson(ImageResponseFormat format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public ImageResponseFormat adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ImageResponseFormat.of(value);
	}
}
