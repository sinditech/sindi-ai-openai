/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * 
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class JsonSchemaResponseFormat extends ResponseFormat {

	@JsonbProperty
	private JsonSchema schema;
	
	@JsonbProperty
	private String description;
	
	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private Boolean strict;
	
	/**
	 * 
	 */
	public JsonSchemaResponseFormat() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param schema
	 */
	public JsonSchemaResponseFormat(JsonSchema schema) {
		super();
		this.schema = Objects.requireNonNull(schema);
	}

	/**
	 * @return the schema
	 */
	public JsonSchema getSchema() {
		return schema;
	}

	/**
	 * @param schema the schema to set
	 */
	public void setSchema(JsonSchema schema) {
		this.schema = schema;
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
