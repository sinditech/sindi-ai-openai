package za.co.sindi.ai.openai.vector_store;

import java.io.Serializable;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.openai.models.ChunkingStrategy;
import za.co.sindi.ai.openai.models.ExpiresAfter;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/vector-stores/create">Create Vector Store reference documentation.</a>
 */
public class VectorStoreInput implements Serializable {

	@JsonbProperty("chunking_strategy")
	private ChunkingStrategy chunkingStrategy;
	
	@JsonbProperty("expires_after")
	private ExpiresAfter expiresAfter;
	
	@JsonbProperty("file_ids")
	private String[] fileIds;
	
	@JsonbProperty
	private Map<String, String> metadata;
	
	@JsonbProperty
	private String name;

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
	 * @return the expiresAfter
	 */
	public ExpiresAfter getExpiresAfter() {
		return expiresAfter;
	}

	/**
	 * @param expiresAfter the expiresAfter to set
	 */
	public void setExpiresAfter(ExpiresAfter expiresAfter) {
		this.expiresAfter = expiresAfter;
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
