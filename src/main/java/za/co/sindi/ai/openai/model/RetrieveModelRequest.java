/**
 * 
 */
package za.co.sindi.ai.openai.model;

import java.util.Objects;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class RetrieveModelRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/models";

	/**
	 * @param model
	 */
	public RetrieveModelRequest(final String model) {
		this(URI, model);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param model
	 */
	public RetrieveModelRequest(final String uri, final String model) {
		super("GET", uri + "/" + Objects.requireNonNull(model));
		// TODO Auto-generated constructor stub
	}
}
