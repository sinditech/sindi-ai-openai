/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.Role;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 */
public class JsonbRoleAdapter implements JsonbAdapter<Role, String> {

	@Override
	public String adaptToJson(Role format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public Role adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return Role.of(value);
	}
}
