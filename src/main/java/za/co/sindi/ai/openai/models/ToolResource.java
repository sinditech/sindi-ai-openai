/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="code_interpreter", type=CodeInterpreterToolResource.class),
	    @JsonbSubtype(alias="file_search", type=FileSearchToolResource.class),
	}
)
public abstract class ToolResource implements Serializable {
	
}
