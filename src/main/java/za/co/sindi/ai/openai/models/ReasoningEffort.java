/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/create">Reasoning Effort</a>
 */
public enum ReasoningEffort {
	LOW("low")
	,MEDIUM("medium")
	,HIGH("high")
	;
	private final String effort;

	/**
	 * @param effort
	 */
	private ReasoningEffort(String effort) {
		this.effort = effort;
	}
	
	public static ReasoningEffort of(final String value) {
		for (ReasoningEffort effort : values()) {
			if (effort.effort.equals(value)) return effort;
		}
		
		throw new IllegalArgumentException("Invalid reasoning effort '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return effort;
	}
}
