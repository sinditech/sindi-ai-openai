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
public class ChatRequestAssistantContentsMessage extends ChatRequestAssistantMessage<AssistantContent[]> {

	@JsonbProperty
	private AssistantContent[] content;
	
	/**
	 * @param content
	 */
	public ChatRequestAssistantContentsMessage(final AssistantContent[] content) {
		super();
		// TODO Auto-generated constructor stub
		this.content = Objects.requireNonNull(content, "A content is required.");
	}
	
	@Override
	public void setContent(AssistantContent[] content) {
		this.content = content;
	}

	@Override
	public AssistantContent[] getContent() {
		// TODO Auto-generated method stub
		return content;
	}
}
