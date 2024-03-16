/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAPI API reference documentation.</a>
 */
public abstract class ChatRequestUserMessage<T extends Serializable> extends ChatRequestMessage<T> {

	@JsonbProperty
	private String name;
	
//	/**
//	 * @param content
//	 */
//	protected ChatRequestUserMessage(Serializable content) {
////		super("user");
//		super();
//		// TODO Auto-generated constructor stub
//		super.content = Objects.requireNonNull(content, "A content is required.");
//	}

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
