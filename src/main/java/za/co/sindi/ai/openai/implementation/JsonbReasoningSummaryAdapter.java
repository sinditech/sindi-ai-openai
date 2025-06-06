/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.ReasoningSummary;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbReasoningSummaryAdapter implements JsonbAdapter<ReasoningSummary, String> {

	@Override
	public String adaptToJson(ReasoningSummary format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public ReasoningSummary adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ReasoningSummary.of(value);
	}
}
