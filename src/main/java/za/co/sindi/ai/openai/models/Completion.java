/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * 
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/completions/object">Completion - OpenAI API reference documentation.</a>
 */
public class Completion implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private List<CompletionChoice> choices;

	@JsonbProperty
	private long created;
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty("system_fingerprint")
	private String systemFingerprint;
	
	@JsonbProperty
	private String object;
	
	@JsonbProperty
	private UsageStatistics usage;

	/**
	 * 
	 */
	public Completion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param choices
	 * @param created
	 * @param model
	 * @param systemFingerprint
	 * @param object
	 * @param usage
	 */
	public Completion(String id, List<CompletionChoice> choices, long created, String model, String systemFingerprint,
			String object, UsageStatistics usage) {
		super();
		this.id = id;
		this.choices = choices;
		this.created = created;
		this.model = model;
		this.systemFingerprint = systemFingerprint;
		this.object = object;
		this.usage = usage;
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
	 * @return the choices
	 */
	public List<CompletionChoice> getChoices() {
		return choices;
	}

	/**
	 * @param choices the choices to set
	 */
	public void setChoices(List<CompletionChoice> choices) {
		this.choices = choices;
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
	 * @return the systemFingerprint
	 */
	public String getSystemFingerprint() {
		return systemFingerprint;
	}

	/**
	 * @param systemFingerprint the systemFingerprint to set
	 */
	public void setSystemFingerprint(String systemFingerprint) {
		this.systemFingerprint = systemFingerprint;
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
