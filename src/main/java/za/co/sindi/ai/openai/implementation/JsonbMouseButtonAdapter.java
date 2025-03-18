/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.MouseButton;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 */
public class JsonbMouseButtonAdapter implements JsonbAdapter<MouseButton, String> {

	@Override
	public String adaptToJson(MouseButton format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public MouseButton adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return MouseButton.of(value);
	}
}
