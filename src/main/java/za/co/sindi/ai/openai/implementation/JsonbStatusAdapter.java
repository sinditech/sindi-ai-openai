/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.Status;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbStatusAdapter implements JsonbAdapter<Status, String> {

	@Override
	public String adaptToJson(Status format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public Status adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return Status.of(value);
	}
}
