/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAPI API reference documentation.</a>
 */
public abstract class ChatMessage<T extends Serializable> implements Serializable {

//	@JsonbProperty
//	protected String role;
	
	/**
	 * @return the content
	 */
	public abstract T getContent();

	/**
	 * @param content the content to set
	 */
	public abstract void setContent(T content);

//	/**
//	 * @return the role
//	 */
//	public String getRole() {
//		return role;
//	}
}
