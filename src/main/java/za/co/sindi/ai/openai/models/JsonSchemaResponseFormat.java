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
}
