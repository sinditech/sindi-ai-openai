/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/models/tts">Audio Response Format</a>
 */
public enum ChatResponseFormat {
	TEXT("text")
	,JSON_OBJECT("json_object")
	,JSON_SCHEMA("json_schema")
	;
	private final String format;

	/**
	 * @param format
	 */
	private ChatResponseFormat(String format) {
		this.format = format;
	}
	
	public static ChatResponseFormat of(final String value) {
		for (ChatResponseFormat format : values()) {
			if (format.format.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid chat response format '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return format;
	}
}
