/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * 
 * @author Buhake Sindi
 * @since 28 February 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/message-list">OpenAI API - Chat Completion message list.</a>
 */
public class ChatCompletionMessage implements Serializable {
	
	@JsonbProperty
	private String id;

	@JsonbProperty
	private String content;
	
	@JsonbProperty
	private String refusal;
	
	@JsonbProperty("tool_calls")
	private ToolCallFunction[] toolCalls;
	
	@JsonbProperty
	private String role;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the refusal
	 */
	public String getRefusal() {
		return refusal;
	}

	/**
	 * @param refusal the refusal to set
	 */
	public void setRefusal(String refusal) {
		this.refusal = refusal;
	}

	/**
	 * @return the toolCalls
	 */
	public ToolCallFunction[] getToolCalls() {
		return toolCalls;
	}

	/**
	 * @param toolCalls the toolCalls to set
	 */
	public void setToolCalls(ToolCallFunction[] toolCalls) {
		this.toolCalls = toolCalls;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
}
