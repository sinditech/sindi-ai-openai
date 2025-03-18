package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/assistants/createAssistant">Create Assistants reference documentation.</a>
 */
public class StaticChunk implements Serializable {

	@JsonbProperty("chunk_overlap_tokens")
	private Integer chunkOverlapTokens;
	
	@JsonbProperty("max_chunk_size_tokens")
	private Integer maxChunkSizeTokens;

	/**
	 * @return the chunkOverlapTokens
	 */
	public Integer getChunkOverlapTokens() {
		return chunkOverlapTokens;
	}

	/**
	 * @param chunkOverlapTokens the chunkOverlapTokens to set
	 */
	public void setChunkOverlapTokens(Integer chunkOverlapTokens) {
		this.chunkOverlapTokens = chunkOverlapTokens;
	}

	/**
	 * @return the maxChunkSizeTokens
	 */
	public Integer getMaxChunkSizeTokens() {
		return maxChunkSizeTokens;
	}

	/**
	 * @param maxChunkSizeTokens the maxChunkSizeTokens to set
	 */
	public void setMaxChunkSizeTokens(Integer maxChunkSizeTokens) {
		this.maxChunkSizeTokens = maxChunkSizeTokens;
	}
}
