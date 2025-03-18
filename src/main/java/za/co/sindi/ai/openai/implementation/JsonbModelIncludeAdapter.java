/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.response.ModelInclude;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbModelIncludeAdapter implements JsonbAdapter<ModelInclude, String> {

	@Override
	public String adaptToJson(ModelInclude format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public ModelInclude adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ModelInclude.of(value);
	}
}
