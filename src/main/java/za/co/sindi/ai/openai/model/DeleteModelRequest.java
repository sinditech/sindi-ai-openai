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
public class DeleteModelRequest extends OpenAIRequest {

	private static final String URI = "/models";

	/**
	 * @param model
	 */
	public DeleteModelRequest(final String model) {
		this(URI, model);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param model
	 */
	public DeleteModelRequest(final String uri, final String model) {
		super("DELETE", uri + "/" + Objects.requireNonNull(model));
		// TODO Auto-generated constructor stub
	}
}
