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
public class AssistantList implements Serializable {

	@JsonbProperty
	private String object;
	
	@JsonbProperty
	private Model[] data;

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
	public Model[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Model[] data) {
		this.data = data;
	}
}
