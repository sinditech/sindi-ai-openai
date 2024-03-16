/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 */
public class EmbeddingList implements Serializable {

	@JsonbProperty
	private String object;
	
	@JsonbProperty
	private Embedding[] data;
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private UsageStatistics usage;

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
	 * @return the data
	 */
	public Embedding[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Embedding[] data) {
		this.data = data;
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
	 * @return the usage
	 */
	public UsageStatistics getUsage() {
		return usage;
	}

	/**
	 * @param usage the usage to set
	 */
	public void setUsage(UsageStatistics usage) {
		this.usage = usage;
	}
}
