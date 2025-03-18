package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class UserLocation implements Serializable {

	@JsonbProperty
	private Approximate approximate;
	
	@JsonbProperty
	private String type = "approximate";

	/**
	 * @return the approximate
	 */
	public Approximate getApproximate() {
		return approximate;
	}

	/**
	 * @param approximate the approximate to set
	 */
	public void setApproximate(Approximate approximate) {
		this.approximate = approximate;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
