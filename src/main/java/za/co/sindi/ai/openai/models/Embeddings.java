/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/models/tts">TTS Model</a>
 */
public enum Embeddings {
	TEXT_EMBEDDING_3_LARGE("text-embedding-3-large")
	,TEXT_EMBEDDING_3_SMALL("text-embedding-3-small")
	,TEXT_EMBEDDING_ADA_002("text-embedding-ada-002")
	;
	private final String model;

	/**
	 * @param model
	 */
	private Embeddings(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return model;
	}
}
