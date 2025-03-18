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
	
	@JsonbProperty("vector_stores")
	private FileSearchVectorStore[] vectorStores;

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

	/**
	 * @return the vectorStores
	 */
	public FileSearchVectorStore[] getVectorStores() {
		return vectorStores;
	}

	/**
	 * @param vectorStores the vectorStores to set
	 */
	public void setVectorStores(FileSearchVectorStore[] vectorStores) {
		this.vectorStores = vectorStores;
	}
}
