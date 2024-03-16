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
		    @JsonbSubtype(alias="text", type=UserTextContent.class),
		    @JsonbSubtype(alias="image_url", type=UserImageUrlContent.class)
		}
	)
public abstract class UserContent implements Serializable {

}
