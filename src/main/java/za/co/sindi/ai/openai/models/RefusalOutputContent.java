package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class RefusalOutputContent extends OutputContent {

	@JsonbProperty
	private String refusal;

	/**
	 * @return the refusal
	 */
	public String getRefusal() {
		return refusal;
	}

	/**
	 * @param refusal the refusal to set
	 */
	public void setRefusal(String refusal) {
		this.refusal = refusal;
	}
}
