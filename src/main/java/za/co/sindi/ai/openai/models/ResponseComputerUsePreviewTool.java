/**
 * 
 */
package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">OpenAI API reference documentation.</a>
 */
public class ResponseComputerUsePreviewTool extends ResponseTool {
	
	@JsonbProperty("display_height")
	private int displayHeight;
	
	@JsonbProperty("display_width")
	private int displayWidth;
	
	@JsonbProperty
	private String environment;

	/**
	 * @return the displayHeight
	 */
	public int getDisplayHeight() {
		return displayHeight;
	}

	/**
	 * @param displayHeight the displayHeight to set
	 */
	public void setDisplayHeight(int displayHeight) {
		this.displayHeight = displayHeight;
	}

	/**
	 * @return the displayWidth
	 */
	public int getDisplayWidth() {
		return displayWidth;
	}

	/**
	 * @param displayWidth the displayWidth to set
	 */
	public void setDisplayWidth(int displayWidth) {
		this.displayWidth = displayWidth;
	}

	/**
	 * @return the environment
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * @param environment the environment to set
	 */
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
}
