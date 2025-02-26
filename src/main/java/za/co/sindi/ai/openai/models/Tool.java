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
	    @JsonbSubtype(alias="code_interpreter", type=CodeInterpreterTool.class),
	    @JsonbSubtype(alias="file_search", type=FileSearchTool.class),
	    @JsonbSubtype(alias="function", type=FunctionTool.class),
	}
)
public abstract class Tool implements Serializable {
	
}
