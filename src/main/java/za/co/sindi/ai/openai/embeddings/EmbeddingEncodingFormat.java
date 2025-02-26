/**
 * 
 */
package za.co.sindi.ai.openai.embeddings;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/models/embeddings">Embeddings</a>
 */
public enum EmbeddingEncodingFormat {
	FLOAT("float")
	,BASE64("base64")
	;
	private final String model;

	/**
	 * @param model
	 */
	private EmbeddingEncodingFormat(String model) {
		this.model = model;
	}
	
	public static EmbeddingEncodingFormat of(final String value) {
		for (EmbeddingEncodingFormat format : values()) {
			if (format.model.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid Embedding encoding format '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return model;
	}
}
