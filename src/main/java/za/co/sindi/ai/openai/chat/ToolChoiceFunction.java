/**
 * 
 */
package za.co.sindi.ai.openai.chat;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class ToolChoiceFunction extends ToolChoice {

	@JsonbProperty
	private String name;
	
	/**
	 * 
	 */
	public ToolChoiceFunction() {
		super();
		//TODO Auto-generated constructor stub
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
