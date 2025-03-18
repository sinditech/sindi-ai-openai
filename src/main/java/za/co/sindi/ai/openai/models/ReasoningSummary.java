/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/create">Reasoning Effort</a>
 */
public enum ReasoningSummary {
	CONCISE("concise")
	,DETAILED("detailed")
	;
	private final String summary;

	/**
	 * @param summary
	 */
	private ReasoningSummary(String summary) {
		this.summary = summary;
	}
	
	public static ReasoningSummary of(final String value) {
		for (ReasoningSummary summary : values()) {
			if (summary.summary.equals(value)) return summary;
		}
		
		throw new IllegalArgumentException("Invalid reasoning summary '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return summary;
	}
}
