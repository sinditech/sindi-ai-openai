/**
 * 
 */
package za.co.sindi.ai.openai.vector_store;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class DeleteVectorStoreRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/vector_stores";
	
	/**
	 * @param vectorStoreId
	 */
	public DeleteVectorStoreRequest(final String vectorStoreId) {
		this(URI, vectorStoreId);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param vectorStoreId
	 */
	public DeleteVectorStoreRequest(final String uri, final String vectorStoreId) {
		super("DELETE", uri + "/" + vectorStoreId);
		// TODO Auto-generated constructor stub
	}
}
