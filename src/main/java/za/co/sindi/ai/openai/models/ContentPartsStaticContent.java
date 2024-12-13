/**
 * 
 */
package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * 
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/create#chat-create-prediction">OpenAI API reference documentation.</a>
 */
public class ContentPartsStaticContent extends StaticContent<ContentPart[]> {

	@JsonbProperty
	private ContentPart[] content;

	/**
	 * @return the content
	 */
	public ContentPart[] getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(ContentPart[] content) {
		this.content = content;
	}
}
