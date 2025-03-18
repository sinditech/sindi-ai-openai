/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.SearchContextSize;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbSearchContextSizeAdapter implements JsonbAdapter<SearchContextSize, String> {

	@Override
	public String adaptToJson(SearchContextSize format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public SearchContextSize adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return SearchContextSize.of(value);
	}
}
