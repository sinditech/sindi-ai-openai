package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/message-list">Chat Completion Message List reference documentation.</a>
 */
public class URLCitationAnnotation extends Annotation {

	@JsonbProperty("url_citation")
	private URLCitation urlCitation;

	/**
	 * @return the urlCitation
	 */
	public URLCitation getUrlCitation() {
		return urlCitation;
	}

	/**
	 * @param urlCitation the urlCitation to set
	 */
	public void setUrlCitation(URLCitation urlCitation) {
		this.urlCitation = urlCitation;
	}
}
