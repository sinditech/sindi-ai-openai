/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class ToolCall implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private Integer index;
	
	@JsonbProperty
	private String type = "function";
	
	@JsonbProperty
	private ToolCallFunction function;

	/**
	 * 
	 */
	public ToolCall() {
		super();
		// TODO Auto-generated constructor stub
		this.type = "function";
	}

	/**
	 * @param id
	 * @param function
	 */
	public ToolCall(String id, ToolCallFunction function) {
		this();
		this.id = Objects.requireNonNull(id);
		this.function = Objects.requireNonNull(function);
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the index
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(Integer index) {
		this.index = index;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the function
	 */
	public ToolCallFunction getFunction() {
		return function;
	}

	/**
	 * @param function the function to set
	 */
	public void setFunction(ToolCallFunction function) {
		this.function = function;
	}
}
