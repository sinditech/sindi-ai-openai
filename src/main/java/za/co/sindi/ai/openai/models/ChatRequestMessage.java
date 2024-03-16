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
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAPI API reference documentation.</a>
 */
@JsonbTypeInfo(
	key = "role",
	value = {
	    @JsonbSubtype(alias="system", type=ChatRequestSystemMessage.class),
	    @JsonbSubtype(alias="user", type=ChatRequestUserStringMessage.class),
	    @JsonbSubtype(alias="user", type=ChatRequestUserContentsMessage.class),
	    @JsonbSubtype(alias="assistant", type=ChatRequestAssistantMessage.class),
	    @JsonbSubtype(alias="tool", type=ChatRequestToolMessage.class),
	    @JsonbSubtype(alias="function", type=ChatRequestFunctionMessage.class) 
	}
)
public abstract class ChatRequestMessage<T extends Serializable> extends ChatMessage<T> {

//	/**
//	 * 
//	 */
//	protected ChatRequestMessage(final String role) {
//		super();
//		// TODO Auto-generated constructor stub
//		super.role = Objects.requireNonNull(role);
//	}
}
