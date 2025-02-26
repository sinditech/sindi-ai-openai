/**
 * 
 */
package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class FileSearchToolResource extends ToolResource {
	
	@JsonbProperty("vector_store_ids")
	private String[] vectorStoreIds;

	/**
	 * @return the vectorStoreIds
	 */
	public String[] getVectorStoreIds() {
		return vectorStoreIds;
	}

	/**
	 * @param vectorStoreIds the vectorStoreIds to set
	 */
	public void setVectorStoreIds(String[] vectorStoreIds) {
		this.vectorStoreIds = vectorStoreIds;
	}
}
