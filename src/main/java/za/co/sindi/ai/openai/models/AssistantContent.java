/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 15 March 2024
 */
@JsonbTypeInfo(
		key = "type",
		value = {
		    @JsonbSubtype(alias="text", type=AssistantTextContent.class),
		    @JsonbSubtype(alias="refusal", type=AssistantRefusalContent.class),
		}
	)
public abstract class AssistantContent implements Serializable {

}
