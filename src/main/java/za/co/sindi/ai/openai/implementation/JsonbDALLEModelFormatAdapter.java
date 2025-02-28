/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.DALLEModelName;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbDALLEModelFormatAdapter implements JsonbAdapter<DALLEModelName, String> {

	@Override
	public String adaptToJson(DALLEModelName model) throws Exception {
		// TODO Auto-generated method stub
		if (model == null) return null;
		return model.toString();
	}

	@Override
	public DALLEModelName adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return DALLEModelName.of(value);
	}
}
