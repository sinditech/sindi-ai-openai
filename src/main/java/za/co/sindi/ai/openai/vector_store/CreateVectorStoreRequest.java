/**
 * 
 */
package za.co.sindi.ai.openai.vector_store;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class CreateVectorStoreRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/vector_stores";
	
	private VectorStoreInput input;
	
	/**
	 * @param input
	 */
	public CreateVectorStoreRequest(final VectorStoreInput input) {
		this(URI, input);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param input
	 */
	public CreateVectorStoreRequest(final String uri, VectorStoreInput input) {
		super("POST", uri, "application/json");
		// TODO Auto-generated constructor stub
		this.input = input;
	}

	/**
	 * @return the input
	 */
	public VectorStoreInput getInput() {
		return input;
	}
}
