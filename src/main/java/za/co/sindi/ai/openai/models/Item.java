package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
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
	    @JsonbSubtype(alias="message", type=Message.class),
	    @JsonbSubtype(alias="file_search_call", type=FileSearchToolCall.class),
	    @JsonbSubtype(alias="computer_call", type=ComputerToolCall.class),
	    @JsonbSubtype(alias="computer_call_output", type=ComputerToolCallOutput.class),
	    @JsonbSubtype(alias="web_search_call", type=WebSearchToolCall.class),
	    @JsonbSubtype(alias="function_call", type=FunctionToolCall.class),
	    @JsonbSubtype(alias="function_call_output", type=FunctionToolCallOutput.class),
	    @JsonbSubtype(alias="reasoning", type=Reasoning.class),
	    @JsonbSubtype(alias="item_reference", type=ItemReference.class),
	}
)
public abstract class Item implements Serializable {

	@JsonbProperty
	private Status status;

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
}
