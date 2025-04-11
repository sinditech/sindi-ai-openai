/**
 * 
 */
package za.co.sindi.ai.openai.vector_store;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 */
public class SearchVectorStoreRequest extends OpenAIRequest {

	private static final String URI = "/vector_stores";
	
	private SearchVectorStoreInput input;
	
	/**
	 * @param vectorStoreId
	 * @param input
	 */
	public SearchVectorStoreRequest(final String vectorStoreId, final SearchVectorStoreInput input) {
		this(URI, vectorStoreId, input);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param input
	 */
	public SearchVectorStoreRequest(final String uri, final String vectorStoreId, SearchVectorStoreInput input) {
		super("POST", uri + "/" + vectorStoreId + "/search", "application/json");
		// TODO Auto-generated constructor stub
		this.input = input;
	}

	/**
	 * @return the input
	 */
	public SearchVectorStoreInput getInput() {
		return input;
	}
}
