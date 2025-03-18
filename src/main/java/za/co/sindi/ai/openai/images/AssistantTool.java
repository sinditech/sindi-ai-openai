/**
 * 
 */
package za.co.sindi.ai.openai.images;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/assistants/object">OpenAI API reference documentation.</a>
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="code_interpreter", type=AssistantCodeInterpreterTool.class),
	    @JsonbSubtype(alias="file_search", type=AssistantFileSearchTool.class),
	    @JsonbSubtype(alias="function", type=AssistantFunctionTool.class),
	}
)
public abstract class AssistantTool implements Serializable {
	
}
