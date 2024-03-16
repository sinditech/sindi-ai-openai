/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAPI API reference documentation.</a>
 */
@Deprecated
public class ChatRequestFunctionMessage extends ChatRequestMessage<String> {

	@JsonbProperty
	private String content;
	
	@JsonbProperty
	private String name;
	
	/**
	 * 
	 */
	public ChatRequestFunctionMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param content
	 */
	public ChatRequestFunctionMessage(String content, final String name) {
//		super("function");
		super();
		// TODO Auto-generated constructor stub
		this.content = Objects.requireNonNull(content);
		this.name = Objects.requireNonNull(name);
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
}
