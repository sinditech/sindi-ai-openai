/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 25 January 2024
 */
public class Moderation implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private ModerationResult[] results;

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
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the results
	 */
	public ModerationResult[] getResults() {
		return results;
	}

	/**
	 * @param results the results to set
	 */
	public void setResults(ModerationResult[] results) {
		this.results = results;
	}
}
