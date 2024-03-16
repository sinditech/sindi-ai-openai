/**
 * 
 */
package za.co.sindi.ai.openai.model;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class ListModelRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/models";

	/**
	 *
	 */
	public ListModelRequest() {
		this(URI);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 */
	public ListModelRequest(final String uri) {
		super("GET", uri);
		// TODO Auto-generated constructor stub
	}
}
