/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.SortOrder;

/**
 * @author Buhake Sindi
 * @since 18 September 2024
 */
public class JsonbSortOrderAdapter implements JsonbAdapter<SortOrder, String> {

	@Override
	public String adaptToJson(SortOrder sortOrder) throws Exception {
		// TODO Auto-generated method stub
		if (sortOrder == null) return null;
		return sortOrder.toString();
	}

	@Override
	public SortOrder adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return SortOrder.of(value);
	}
}
