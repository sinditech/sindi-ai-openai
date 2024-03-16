/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.GPTModelName;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbGPTModelFormatAdapter implements JsonbAdapter<GPTModelName, String> {

	@Override
	public String adaptToJson(GPTModelName model) throws Exception {
		// TODO Auto-generated method stub
		if (model == null) return null;
		return model.toString();
	}

	@Override
	public GPTModelName adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return GPTModelName.of(value);
	}
}
