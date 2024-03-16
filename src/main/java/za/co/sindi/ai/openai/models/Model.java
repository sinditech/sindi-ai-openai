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
public class Model implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private long created;
	
	@JsonbProperty
	private String object;
	
	@JsonbProperty("owned_by")
	private String ownedBy;

	/**
	 * 
	 */
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param created
	 * @param object
	 * @param ownedBy
	 */
	public Model(String id, long created, String object, String ownedBy) {
		super();
		this.id = id;
		this.created = created;
		this.object = object;
		this.ownedBy = ownedBy;
	}

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
	 * @return the created
	 */
	public long getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(long created) {
		this.created = created;
	}

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
	 * @return the ownedBy
	 */
	public String getOwnedBy() {
		return ownedBy;
	}

	/**
	 * @param ownedBy the ownedBy to set
	 */
	public void setOwnedBy(String ownedBy) {
		this.ownedBy = ownedBy;
	}
}
