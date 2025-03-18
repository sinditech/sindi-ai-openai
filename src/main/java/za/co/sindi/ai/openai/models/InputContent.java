package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="input_text", type=TextInputContent.class),
	    @JsonbSubtype(alias="input_image", type=ImageInputContent.class),
	    @JsonbSubtype(alias="input_file", type=FileInputContent.class),
	}
)
public abstract class InputContent extends Content {

}
