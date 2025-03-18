/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.FinishReason;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbFinishReasonAdapter implements JsonbAdapter<FinishReason, String> {

	@Override
	public String adaptToJson(FinishReason format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public FinishReason adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return FinishReason.of(value);
	}
}
