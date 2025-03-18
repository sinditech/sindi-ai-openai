/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.ReasoningEffort;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbReasoningEffortAdapter implements JsonbAdapter<ReasoningEffort, String> {

	@Override
	public String adaptToJson(ReasoningEffort format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public ReasoningEffort adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ReasoningEffort.of(value);
	}
}
