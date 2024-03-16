/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/images/create">Image Prompt request body</a>
 */
public enum ImageSize {
	_256_BY_256("256x256")
	,_512_BY_512("512x512")
	,_1024_BY_1024("1024x1024")
	,_1792_BY_1024("1792x1024")
	,_1024_BY_1792("1024x1792")
	;
	private final String format;

	/**
	 * @param format
	 */
	private ImageSize(String format) {
		this.format = format;
	}
	
	public static ImageSize of(final String value) {
		for (ImageSize format : values()) {
			if (format.format.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid image size '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return format;
	}
}
