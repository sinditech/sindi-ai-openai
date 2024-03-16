/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public enum ImageDetail {
	AUTO("auto")
	,HIGH("high")
	,LOW("low")
	;
	private final String detail;

	/**
	 * @param detail
	 */
	private ImageDetail(String detail) {
		this.detail = detail;
	}

	public static ImageDetail of(final String value) {
		for (ImageDetail id : values()) {
			if (id.detail.equals(value)) return id;
		}
		
		throw new IllegalArgumentException("Invalid image detail '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return detail;
	}
}
