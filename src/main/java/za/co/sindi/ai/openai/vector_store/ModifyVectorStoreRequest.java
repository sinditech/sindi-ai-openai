/**
 * 
 */
package za.co.sindi.ai.openai.vector_store;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class ModifyVectorStoreRequest extends OpenAIRequest {

	private static final String URI = "/vector_stores";
	
	private ModifyVectorStoreInput input;
	
	/**
	 * @param vectorStoreId
	 * @param input
	 */
	public ModifyVectorStoreRequest(final String vectorStoreId, final ModifyVectorStoreInput input) {
		this(URI, vectorStoreId, input);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param input
	 */
	public ModifyVectorStoreRequest(final String uri, final String vectorStoreId, ModifyVectorStoreInput input) {
		super("POST", uri + "/" + vectorStoreId, "application/json");
		// TODO Auto-generated constructor stub
		this.input = input;
	}

	/**
	 * @return the input
	 */
	public ModifyVectorStoreInput getInput() {
		return input;
	}
}
