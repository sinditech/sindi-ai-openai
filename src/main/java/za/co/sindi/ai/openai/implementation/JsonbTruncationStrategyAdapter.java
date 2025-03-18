/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.TruncationStrategy;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbTruncationStrategyAdapter implements JsonbAdapter<TruncationStrategy, String> {

	@Override
	public String adaptToJson(TruncationStrategy format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public TruncationStrategy adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return TruncationStrategy.of(value);
	}
}
