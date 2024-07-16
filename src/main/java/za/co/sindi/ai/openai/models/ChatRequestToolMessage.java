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
public class ChatRequestToolMessage extends ChatRequestMessage<String> {

	@JsonbProperty
	private String content;
	
	@JsonbProperty
	private String name;
	
	@JsonbProperty("tool_call_id")
	private String toolCallId;
	
	/**
	 * @param content
	 */
	public ChatRequestToolMessage(String content, final String toolCallId) {
//		super("tool");
		super();
		// TODO Auto-generated constructor stub
		this.content = Objects.requireNonNull(content);
		this.toolCallId = Objects.requireNonNull(toolCallId);
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

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the toolCallId
	 */
	public String getToolCallId() {
		return toolCallId;
	}
}
