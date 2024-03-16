/**
 * 
 */
package za.co.sindi.ai.openai.embeddings;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.ai.openai.models.EmbeddingInput;
import za.co.sindi.ai.openai.models.EmbeddingInputIntArray;
import za.co.sindi.ai.openai.models.EmbeddingInputIntArrays;
import za.co.sindi.ai.openai.models.EmbeddingInputString;
import za.co.sindi.ai.openai.models.EmbeddingInputStringArray;
import za.co.sindi.ai.openai.models.Embeddings;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class CreateEmbeddingRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/embeddings";
	
	private EmbeddingInput<?> input;
	
	/**
	 * @param input
	 * @param model
	 */
	public CreateEmbeddingRequest(final String input, final Embeddings model) {
		this(new EmbeddingInputString(input, model));
	}
	
	/**
	 * @param uri
	 * @param input
	 * @param model
	 */
	public CreateEmbeddingRequest(final String uri, final String input, final Embeddings model) {
		this(uri, new EmbeddingInputString(input, model));
	}
	
	/**
	 * @param input
	 * @param model
	 */
	public CreateEmbeddingRequest(final String[] input, final Embeddings model) {
		this(new EmbeddingInputStringArray(input, model));
	}
	
	/**
	 * @param uri
	 * @param input
	 * @param model
	 */
	public CreateEmbeddingRequest(final String uri, final String[] input, final Embeddings model) {
		this(uri, new EmbeddingInputStringArray(input, model));
	}
	
	/**
	 * @param input
	 * @param model
	 */
	public CreateEmbeddingRequest(final int[] input, final Embeddings model) {
		this(new EmbeddingInputIntArray(input, model));
	}
	
	/**
	 * @param uri
	 * @param input
	 * @param model
	 */
	public CreateEmbeddingRequest(final String uri, final int[] input, final Embeddings model) {
		this(uri, new EmbeddingInputIntArray(input, model));
	}
	
	/**
	 * @param input
	 * @param model
	 */
	public CreateEmbeddingRequest(final int[][] input, final Embeddings model) {
		this(new EmbeddingInputIntArrays(input, model));
	}
	
	/**
	 * @param uri
	 * @param input
	 * @param model
	 */
	public CreateEmbeddingRequest(final String uri, final int[][] input, final Embeddings model) {
		this(uri, new EmbeddingInputIntArrays(input, model));
	}

	/**
	 * @param input
	 */
	public CreateEmbeddingRequest(final EmbeddingInput<?> input) {
		this(URI, input);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param input
	 */
	public CreateEmbeddingRequest(final String uri, final EmbeddingInput<?> input) {
		super("POST", uri, "application/json");
		// TODO Auto-generated constructor stub
		this.input = input;
	}

	/**
	 * @return the input
	 */
	public EmbeddingInput<?> getInput() {
		return input;
	}
}
