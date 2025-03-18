/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">OpenAI API reference documentation.</a>
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="computer_use_preview", type=ResponseComputerUsePreviewTool.class),
	    @JsonbSubtype(alias="file_search", type=ResponseFileSearchTool.class),
	    @JsonbSubtype(alias="function", type=ResponseFunctionTool.class),
	    @JsonbSubtype(alias="web_search_preview", type=ResponseWebSearchPreviewTool.class),
	    @JsonbSubtype(alias="web_search_preview_2025_03_11", type=ResponseWebSearchPreviewTool.class),
	}
)
public abstract class ResponseTool implements Serializable {
	
}
