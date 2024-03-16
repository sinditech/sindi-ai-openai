/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/images/create">Image Prompt request body</a>
 */
public enum ImageQuality {
	STANDARD("standard")
	,HD("hd")
	;
	private final String format;

	/**
	 * @param format
	 */
	private ImageQuality(String format) {
		this.format = format;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return format;
	}
}
