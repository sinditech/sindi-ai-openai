/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.ModerationModelName;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbModerationModelNameAdapter implements JsonbAdapter<ModerationModelName, String> {

	@Override
	public String adaptToJson(ModerationModelName model) throws Exception {
		// TODO Auto-generated method stub
		if (model == null) return null;
		return model.toString();
	}

	@Override
	public ModerationModelName adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ModerationModelName.of(value);
	}
}
