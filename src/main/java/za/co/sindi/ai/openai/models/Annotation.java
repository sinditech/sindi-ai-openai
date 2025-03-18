package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/message-list">Chat Completion Message List reference documentation.</a>
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="url_citation", type=URLCitationAnnotation.class),
	}
)
public abstract class Annotation implements Serializable {

}
