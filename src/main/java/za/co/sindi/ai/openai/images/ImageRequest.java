/**
 * 
 */
package za.co.sindi.ai.openai.images;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.ai.openai.models.ImagePrompt;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class ImageRequest extends OpenAIRequest {

	private static final String URI = "/images/generations";
	
	private ImagePrompt prompt;
	
	/**
	 * 
	 * @param prompt
	 */
	public ImageRequest(final String prompt) {
		this(new ImagePrompt(prompt));
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param prompt
	 */
	public ImageRequest(final String uri, final String prompt) {
		this(uri, new ImagePrompt(prompt));
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param prompt
	 */
	public ImageRequest(final ImagePrompt prompt) {
		this(URI, prompt);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param prompt
	 */
	public ImageRequest(final String uri, final ImagePrompt prompt) {
		super("POST", uri, "application/json");
		// TODO Auto-generated constructor stub
		this.prompt = prompt;
	}

	/**
	 * @return the prompt
	 */
	public ImagePrompt getPrompt() {
		return prompt;
	}
}
