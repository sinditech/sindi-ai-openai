/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.TTSModel;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbTTSModelFormatAdapter implements JsonbAdapter<TTSModel, String> {

	@Override
	public String adaptToJson(TTSModel model) throws Exception {
		// TODO Auto-generated method stub
		if (model == null) return null;
		return model.toString();
	}

	@Override
	public TTSModel adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return TTSModel.of(value);
	}
}
