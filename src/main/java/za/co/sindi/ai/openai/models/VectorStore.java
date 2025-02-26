/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * 
 * @author Buhake Sindi
 * @since 26 February 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/completions/object">Completion - OpenAI API reference documentation.</a>
 */
public class VectorStore implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private String object;

	@JsonbProperty("created_at")
	private long createdAt;
	
	@JsonbProperty
	private String name;
	
	@JsonbProperty("usage_bytes")
	private long usageBytes;
	
	@JsonbProperty("file_counts")
	private FileCount fileCounts;
	
	@JsonbProperty
	private String status;
	
	@JsonbProperty("expires_after")
	private ExpiresAfter expiresAfter;
	
	@JsonbProperty("expires_at")
	private long expiresAt;
	
	@JsonbProperty("last_active_at")
	private long lastActiveAt;
	
	@JsonbProperty
	private Map<String, Object> metadata;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the object
	 */
	public String getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(String object) {
		this.object = object;
	}

	/**
	 * @return the createdAt
	 */
	public long getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
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

	/**
	 * @return the usageBytes
	 */
	public long getUsageBytes() {
		return usageBytes;
	}

	/**
	 * @param usageBytes the usageBytes to set
	 */
	public void setUsageBytes(long usageBytes) {
		this.usageBytes = usageBytes;
	}

	/**
	 * @return the fileCounts
	 */
	public FileCount getFileCounts() {
		return fileCounts;
	}

	/**
	 * @param fileCounts the fileCounts to set
	 */
	public void setFileCounts(FileCount fileCounts) {
		this.fileCounts = fileCounts;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
	 * @return the expiresAt
	 */
	public long getExpiresAt() {
		return expiresAt;
	}

	/**
	 * @param expiresAt the expiresAt to set
	 */
	public void setExpiresAt(long expiresAt) {
		this.expiresAt = expiresAt;
	}

	/**
	 * @return the lastActiveAt
	 */
	public long getLastActiveAt() {
		return lastActiveAt;
	}

	/**
	 * @param lastActiveAt the lastActiveAt to set
	 */
	public void setLastActiveAt(long lastActiveAt) {
		this.lastActiveAt = lastActiveAt;
	}

	/**
	 * @return the metadata
	 */
	public Map<String, Object> getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}
}
