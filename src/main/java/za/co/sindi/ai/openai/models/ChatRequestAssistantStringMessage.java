/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class ChatRequestAssistantStringMessage extends ChatRequestAssistantMessage<String> {

	@JsonbProperty
	private String content;
	
	/**
	 * @param content
	 */
	public ChatRequestAssistantStringMessage(final String content) {
		super();
		// TODO Auto-generated constructor stub
		this.content = Objects.requireNonNull(content, "A content is required.");
	}
	
	@Override
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return content;
	}
}
