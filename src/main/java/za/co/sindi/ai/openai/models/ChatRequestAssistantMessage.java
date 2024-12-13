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
public abstract class ChatRequestAssistantMessage<T extends Serializable> extends ChatRequestMessage<T> {

	@JsonbProperty
	private String refusal;
	
	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private AssistantAudio audio;
	
	@JsonbProperty("tool_calls")
	private ToolCall[] toolCalls;
	
//	@JsonbProperty("function_calls")
//	@Deprecated
//	private Function[] functionCalls;
	
	/**
	 * 
	 */
	public ChatRequestAssistantMessage() {
//		super("assistant");
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the audio
	 */
	public AssistantAudio getAudio() {
		return audio;
	}

	/**
	 * @param audio the audio to set
	 */
	public void setAudio(AssistantAudio audio) {
		this.audio = audio;
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

//	/**
//	 * @return the functionCalls
//	 */
//	public Function[] getFunctionCalls() {
//		return functionCalls;
//	}
//
//	/**
//	 * @param functionCalls the functionCalls to set
//	 */
//	public void setFunctionCalls(Function[] functionCalls) {
//		this.functionCalls = functionCalls;
//	}
}
