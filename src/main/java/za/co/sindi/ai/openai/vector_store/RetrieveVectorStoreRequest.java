/**
 * 
 */
package za.co.sindi.ai.openai.vector_store;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class RetrieveVectorStoreRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/vector_stores";

	/**
	 * @param vectorStoreId
	 */
	public RetrieveVectorStoreRequest(final String vectorStoreId) {
		this(URI, vectorStoreId);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param vectorStoreId
	 */
	public RetrieveVectorStoreRequest(final String uri, final String vectorStoreId) {
		super("GET", uri + "/" + vectorStoreId);
		// TODO Auto-generated constructor stub
	}
}
