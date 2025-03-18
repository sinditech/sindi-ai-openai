package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/assistants/createAssistant">Create Assistants reference documentation.</a>
 */

public class FileSearchVectorStore implements Serializable {

	@JsonbProperty("chunking_strategy")
	private ChunkingStrategy chunkingStrategy;
	
	@JsonbProperty("file_ids")
	private String[] fileIds;
	
	@JsonbProperty
	private Map<String, String> metadata;

	/**
	 * @return the chunkingStrategy
	 */
	public ChunkingStrategy getChunkingStrategy() {
		return chunkingStrategy;
	}

	/**
	 * @param chunkingStrategy the chunkingStrategy to set
	 */
	public void setChunkingStrategy(ChunkingStrategy chunkingStrategy) {
		this.chunkingStrategy = chunkingStrategy;
	}

	/**
	 * @return the fileIds
	 */
	public String[] getFileIds() {
		return fileIds;
	}

	/**
	 * @param fileIds the fileIds to set
	 */
	public void setFileIds(String[] fileIds) {
		this.fileIds = fileIds;
	}

	/**
	 * @return the metadata
	 */
	public Map<String, String> getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}
}
