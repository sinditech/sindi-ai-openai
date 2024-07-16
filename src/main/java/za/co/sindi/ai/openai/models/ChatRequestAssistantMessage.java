/**
 * 
 */
package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class ChatRequestAssistantMessage extends ChatRequestMessage<String> {

	@JsonbProperty
	private String content;
	
	/**
	 * 
	 */
	public ChatRequestAssistantMessage() {
//		super("assistant");
		super();
		// TODO Auto-generated constructor stub
	}

	@JsonbProperty
	private String name;
	
	@JsonbProperty("tool_calls")
	private ToolCall[] toolCalls;
	
	@JsonbProperty("function_calls")
	@Deprecated
	private Function[] functionCalls;
	
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
