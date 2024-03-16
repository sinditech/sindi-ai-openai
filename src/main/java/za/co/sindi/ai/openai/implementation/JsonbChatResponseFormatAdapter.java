/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.ChatResponseFormat;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbChatResponseFormatAdapter implements JsonbAdapter<ChatResponseFormat, String> {

	@Override
	public String adaptToJson(ChatResponseFormat format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public ChatResponseFormat adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ChatResponseFormat.of(value);
	}
}
