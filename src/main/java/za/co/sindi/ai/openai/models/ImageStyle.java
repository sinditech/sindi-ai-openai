/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/images/create">Image Prompt request body</a>
 */
public enum ImageStyle {
	VIVID("vivid")
	,NATURAL("natural")
	;
	private final String format;

	/**
	 * @param format
	 */
	private ImageStyle(String format) {
		this.format = format;
	}
	
	public static ImageStyle of(final String value) {
		for (ImageStyle format : values()) {
			if (format.format.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid image style '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return format;
	}
}
