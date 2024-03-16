/**
 * 
 */
package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAPI API reference documentation.</a>
 */
public class ChatResponseMessage extends ChatMessage<String> {
	
	@JsonbProperty
	private String content;

	@JsonbProperty("tool_calls")
	private ToolCall[] toolCalls;
	
	@JsonbProperty("function_calls")
	@Deprecated
	private Function[] functionCalls;

	/**
	 * 
	 */
	public ChatResponseMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param toolCalls
	 * @param functionCalls
	 */
	public ChatResponseMessage(final String content, final ToolCall[] toolCalls, final String role, final Function[] functionCalls) {
		super();
		this.content = content;
		this.toolCalls = toolCalls;
//		this.role = role;
		this.functionCalls = functionCalls;
	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return content;
	}

	@Override
	public void setContent(String content) {
		// TODO Auto-generated method stub
		this.content = content;
	}

	/**
	 * @return the toolCalls
	 */
	public ToolCall[] getToolCalls() {
		return toolCalls;
	}

	/**
	 * @param toolCalls the toolCalls to set
	 */
	public void setToolCalls(ToolCall[] toolCalls) {
		this.toolCalls = toolCalls;
	}

	/**
	 * @return the functionCalls
	 */
	public Function[] getFunctionCalls() {
		return functionCalls;
	}

	/**
	 * @param functionCalls the functionCalls to set
	 */
	public void setFunctionCalls(Function[] functionCalls) {
		this.functionCalls = functionCalls;
	}
}
