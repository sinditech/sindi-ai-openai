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
	
	@JsonbProperty
	private Annotation[] annotations;
	
	@JsonbProperty
	private Audio audio;
	
	@JsonbProperty("function_calls")
	@Deprecated
	private Function[] functionCalls;
	
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
	 * @return the annotations
	 */
	public Annotation[] getAnnotations() {
		return annotations;
	}

	/**
	 * @param annotations the annotations to set
	 */
	public void setAnnotations(Annotation[] annotations) {
		this.annotations = annotations;
	}

	/**
	 * @return the audio
	 */
	public Audio getAudio() {
		return audio;
	}

	/**
	 * @param audio the audio to set
	 */
	public void setAudio(Audio audio) {
		this.audio = audio;
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
