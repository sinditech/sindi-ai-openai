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
public class LogProbability implements Serializable {

	@JsonbProperty
	private ContentTokenProbability[] content;
	
	/**
	 * 
	 */
	public LogProbability() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param content
	 */
	public LogProbability(ContentTokenProbability[] content) {
		super();
		this.content = content;
	}

	/**
	 * @return the content
	 */
	public ContentTokenProbability[] getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(ContentTokenProbability[] content) {
		this.content = content;
	}
}
