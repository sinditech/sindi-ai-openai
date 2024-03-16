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
public class ImageList implements Serializable {

	@JsonbProperty
	private int created;
	
	@JsonbProperty
	private Image[] data;

	/**
	 * @return the created
	 */
	public int getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(int created) {
		this.created = created;
	}

	/**
	 * @return the data
	 */
	public Image[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Image[] data) {
		this.data = data;
	}
}
