/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.DallEModelName;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbDALLEModelFormatAdapter implements JsonbAdapter<DallEModelName, String> {

	@Override
	public String adaptToJson(DallEModelName model) throws Exception {
		// TODO Auto-generated method stub
		if (model == null) return null;
		return model.toString();
	}

	@Override
	public DallEModelName adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return DallEModelName.of(value);
	}
}
