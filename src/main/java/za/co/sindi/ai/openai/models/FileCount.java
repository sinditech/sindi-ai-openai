package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 26 February 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/vector-stores/object">Vector store object</a>
 */
public class FileCount implements Serializable {

	@JsonbProperty("in_progress")
	private Integer inProgress;
	
	@JsonbProperty
	private Integer completed;

	@JsonbProperty
	private Integer failed;
	
	@JsonbProperty
	private Integer cancelled;
	
	@JsonbProperty
	private Integer total;

	/**
	 * @return the inProgress
	 */
	public Integer getInProgress() {
		return inProgress;
	}

	/**
	 * @param inProgress the inProgress to set
	 */
	public void setInProgress(Integer inProgress) {
		this.inProgress = inProgress;
	}

	/**
	 * @return the completed
	 */
	public Integer getCompleted() {
		return completed;
	}

	/**
	 * @param completed the completed to set
	 */
	public void setCompleted(Integer completed) {
		this.completed = completed;
	}

	/**
	 * @return the failed
	 */
	public Integer getFailed() {
		return failed;
	}

	/**
	 * @param failed the failed to set
	 */
	public void setFailed(Integer failed) {
		this.failed = failed;
	}

	/**
	 * @return the cancelled
	 */
	public Integer getCancelled() {
		return cancelled;
	}

	/**
	 * @param cancelled the cancelled to set
	 */
	public void setCancelled(Integer cancelled) {
		this.cancelled = cancelled;
	}

	/**
	 * @return the total
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}
}
