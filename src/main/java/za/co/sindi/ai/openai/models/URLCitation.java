package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/message-list">Chat Completion Message List reference documentation.</a>
 */
public class URLCitation extends Citation {

	@JsonbProperty("end_index")
	private Integer endIndex;
	
	@JsonbProperty("start_index")
	private Integer startIndex;
	
	@JsonbProperty
	private String title;
	
	@JsonbProperty
	private String url;

	/**
	 * @return the endIndex
	 */
	public Integer getEndIndex() {
		return endIndex;
	}

	/**
	 * @param endIndex the endIndex to set
	 */
	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}

	/**
	 * @return the startIndex
	 */
	public Integer getStartIndex() {
		return startIndex;
	}

	/**
	 * @param startIndex the startIndex to set
	 */
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
