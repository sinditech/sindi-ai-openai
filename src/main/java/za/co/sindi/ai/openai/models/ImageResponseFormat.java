/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/images/create">Image Response Format</a>
 */
public enum ImageResponseFormat {
	URL("url")
	,B64_JSON("b64_json")
	;
	private final String format;

	/**
	 * @param format
	 */
	private ImageResponseFormat(String format) {
		this.format = format;
	}
	
	public static ImageResponseFormat of(final String value) {
		for (ImageResponseFormat format : values()) {
			if (format.format.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid image response format '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return format;
	}
}
