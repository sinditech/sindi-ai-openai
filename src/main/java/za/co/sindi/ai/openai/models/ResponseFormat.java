/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * 
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="json_object", type=JsonObjectResponseFormat.class),
	    @JsonbSubtype(alias="json_schema", type=JsonSchemaResponseFormat.class),
	    @JsonbSubtype(alias="text", type=TextResponseFormat.class),
	}
)
public abstract class ResponseFormat implements Serializable {

}
