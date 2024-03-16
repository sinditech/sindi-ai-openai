/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/images/create">Image Prompt request body</a>
 */
public enum ImageModel {
	DALL_E_2("dall_e_2")
	,DALL_E_3("dall_e_3")
	;
	private final String format;

	/**
	 * @param format
	 */
	private ImageModel(String format) {
		this.format = format;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return format;
	}
}
