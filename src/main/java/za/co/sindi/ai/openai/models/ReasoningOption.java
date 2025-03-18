package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class ReasoningOption implements Serializable {

	@JsonbProperty
	private ReasoningEffort effort;
	
	@JsonbProperty("generate_summary")
	private ReasoningSummary generateSummary;

	/**
	 * @return the effort
	 */
	public ReasoningEffort getEffort() {
		return effort;
	}

	/**
	 * @param effort the effort to set
	 */
	public void setEffort(ReasoningEffort effort) {
		this.effort = effort;
	}

	/**
	 * @return the generateSummary
	 */
	public ReasoningSummary getGenerateSummary() {
		return generateSummary;
	}

	/**
	 * @param generateSummary the generateSummary to set
	 */
	public void setGenerateSummary(ReasoningSummary generateSummary) {
		this.generateSummary = generateSummary;
	}
}
