package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/assistants/createAssistant">Create Assistants reference documentation.</a>
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="auto", type=AutoChunkingStrategy.class),
	    @JsonbSubtype(alias="static", type=StaticChunkingStrategy.class),
	}
)
public abstract class ChunkingStrategy implements Serializable {

}
