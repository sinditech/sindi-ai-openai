/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.ImageDetail;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbImageDetailAdapter implements JsonbAdapter<ImageDetail, String> {

	@Override
	public String adaptToJson(ImageDetail imageDetail) throws Exception {
		// TODO Auto-generated method stub
		if (imageDetail == null) return null;
		return imageDetail.toString();
	}

	@Override
	public ImageDetail adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ImageDetail.of(value);
	}
}
