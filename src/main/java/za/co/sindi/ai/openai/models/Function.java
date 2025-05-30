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
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class Function implements Serializable {

	@JsonbProperty
	private String description;
	
	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private Parameters parameters;
	
	@JsonbProperty
	private Boolean strict;

	/**
	 * 
	 */
	public Function() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public Function(String name) {
		super();
		this.name = Objects.requireNonNull(name);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the parameters
	 */
	public Parameters getParameters() {
		return parameters;
	}

	/**
	 * @param parameters the parameters to set
	 */
	public void setParameters(Parameters parameters) {
		this.parameters = parameters;
	}

	/**
	 * @return the strict
	 */
	public Boolean getStrict() {
		return strict;
	}

	/**
	 * @param strict the strict to set
	 */
	public void setStrict(Boolean strict) {
		this.strict = strict;
	}
}
