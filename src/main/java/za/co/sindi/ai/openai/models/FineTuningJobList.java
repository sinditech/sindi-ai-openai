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
public class FineTuningJobList implements Serializable {

	@JsonbProperty
	private String object;
	
	@JsonbProperty
	private FineTuningJob[] data;
	
	@JsonbProperty("has_more")
	private boolean hasMore;

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
	public FineTuningJob[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(FineTuningJob[] data) {
		this.data = data;
	}

	/**
	 * @return the hasMore
	 */
	public boolean isHasMore() {
		return hasMore;
	}

	/**
	 * @param hasMore the hasMore to set
	 */
	public void setHasMore(boolean hasMore) {
		this.hasMore = hasMore;
	}
}
