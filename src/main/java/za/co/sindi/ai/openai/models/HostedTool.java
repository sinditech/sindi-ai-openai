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
	    @JsonbSubtype(alias="file_search", type=FileSearchHostedTool.class),
	    @JsonbSubtype(alias="web_search_preview", type=WebSearchPreviewHostedTool.class),
	    @JsonbSubtype(alias="computer_use_preview", type=ComputerUsePreviewHostedTool.class),
	}
)
public abstract class HostedTool implements Serializable {
	
}
