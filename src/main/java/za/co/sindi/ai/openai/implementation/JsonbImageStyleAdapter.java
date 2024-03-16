/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.ImageStyle;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbImageStyleAdapter implements JsonbAdapter<ImageStyle, String> {

	@Override
	public String adaptToJson(ImageStyle format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public ImageStyle adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ImageStyle.of(value);
	}
}
