/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 18 September 2024
 */
public class StreamOptions implements Serializable {

	@JsonbProperty("include_usage")
	private Boolean includeUsage;

	/**
	 * @return the includeUsage
	 */
	public Boolean getIncludeUsage() {
		return includeUsage;
	}

	/**
	 * @param includeUsage the includeUsage to set
	 */
	public void setIncludeUsage(Boolean includeUsage) {
		this.includeUsage = includeUsage;
	}
}
