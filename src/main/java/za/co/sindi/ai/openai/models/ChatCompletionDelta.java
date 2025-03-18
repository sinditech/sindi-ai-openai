/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class ChatCompletionDelta implements Serializable {
	
	@JsonbProperty
	private String content;
	
	@JsonbProperty
	private String refusal;
	
	@JsonbProperty
	private String role;

	@JsonbProperty("tool_calls")
	private ToolCall[] toolCalls;
	
	@JsonbProperty("function_calls")
	@Deprecated
	private Function[] functionCalls;

	/**
	 * 
	 */
	public ChatCompletionDelta() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param toolCalls
	 * @param functionCalls
	 */
	public ChatCompletionDelta(final String content, final ToolCall[] toolCalls) {
		super();
		this.content = content;
		this.toolCalls = toolCalls;
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
