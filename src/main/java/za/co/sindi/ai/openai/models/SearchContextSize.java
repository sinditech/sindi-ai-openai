/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/create">Web Search Context Size</a>
 */
public enum SearchContextSize {
	LOW("low")
	,MEDIUM("medium")
	,HIGH("high")
	;
	private final String level;

	/**
	 * @param level
	 */
	private SearchContextSize(String level) {
		this.level = level;
	}
	
	public static SearchContextSize of(final String value) {
		for (SearchContextSize scz : values()) {
			if (scz.level.equals(value)) return scz;
		}
		
		throw new IllegalArgumentException("Invalid search context size '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return level;
	}
}
