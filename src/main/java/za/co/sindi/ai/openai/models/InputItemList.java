/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class InputItemList implements Serializable {

	@JsonbProperty
	private String object;
	
	@JsonbProperty
	private Item[] data;

	@JsonbProperty("first_id")
	private String firstId;
	
	@JsonbProperty("last_id")
	private String lastId;
	
	@JsonbProperty("has_more")
	private Boolean hasMore;

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
	public Item[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Item[] data) {
		this.data = data;
	}

	/**
	 * @return the firstId
	 */
	public String getFirstId() {
		return firstId;
	}

	/**
	 * @param firstId the firstId to set
	 */
	public void setFirstId(String firstId) {
		this.firstId = firstId;
	}

	/**
	 * @return the lastId
	 */
	public String getLastId() {
		return lastId;
	}

	/**
	 * @param lastId the lastId to set
	 */
	public void setLastId(String lastId) {
		this.lastId = lastId;
	}

	/**
	 * @return the hasMore
	 */
	public Boolean getHasMore() {
		return hasMore;
	}

	/**
	 * @param hasMore the hasMore to set
	 */
	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}
}
