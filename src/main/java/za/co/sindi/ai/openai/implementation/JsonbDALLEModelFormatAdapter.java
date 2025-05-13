/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.ImageGenerationModelName;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbDALLEModelFormatAdapter implements JsonbAdapter<ImageGenerationModelName, String> {

	@Override
	public String adaptToJson(ImageGenerationModelName model) throws Exception {
		// TODO Auto-generated method stub
		if (model == null) return null;
		return model.toString();
	}

	@Override
	public ImageGenerationModelName adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ImageGenerationModelName.of(value);
	}
}
