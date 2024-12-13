/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class AssistantRefusalContent extends UserContent {

	@JsonbProperty
	private String refusal;

	/**
	 * @param refusal
	 */
	public AssistantRefusalContent(String refusal) {
		super();
		this.refusal = Objects.requireNonNull(refusal, "A refusal is required.");
	}

	/**
	 * @return the refusal
	 */
	public String getRefusal() {
		return refusal;
	}
}
