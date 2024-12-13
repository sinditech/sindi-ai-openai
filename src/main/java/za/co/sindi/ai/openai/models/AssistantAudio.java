/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/audio">OpenAPI API reference documentation.</a>
 */
public class AssistantAudio implements Serializable {

	@JsonbProperty
	private String id;
	
	/**
	 * @param id
	 */
	public AssistantAudio(String id) {
		super();
		this.id = Objects.requireNonNull(id);
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
}
