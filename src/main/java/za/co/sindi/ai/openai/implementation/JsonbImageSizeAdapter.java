/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.ImageSize;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbImageSizeAdapter implements JsonbAdapter<ImageSize, String> {

	@Override
	public String adaptToJson(ImageSize format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public ImageSize adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ImageSize.of(value);
	}
}
