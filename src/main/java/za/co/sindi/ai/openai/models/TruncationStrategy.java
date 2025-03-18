/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Web Search Context Size</a>
 */
public enum TruncationStrategy {
	AUTO("auto")
	,DISABLED("disabled")
	;
	private final String truncation;

	/**
	 * @param truncation
	 */
	private TruncationStrategy(String truncation) {
		this.truncation = truncation;
	}
	
	public static TruncationStrategy of(final String value) {
		for (TruncationStrategy truncation : values()) {
			if (truncation.truncation.equals(value)) return truncation;
		}
		
		throw new IllegalArgumentException("Invalid truncation '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return truncation;
	}
}
