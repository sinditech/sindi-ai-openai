/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/models/overview">Model Overview</a>
 */
public enum DallEModelName {
	DALL_E_3("dall-e-3")
	,DALL_E_2("dall-e-2")
	;
	private final String model;

	/**
	 * @param model
	 */
	private DallEModelName(String model) {
		this.model = model;
	}
	
	public static DallEModelName of(final String value) {
		for (DallEModelName model : values()) {
			if (model.model.equals(value)) return model;
		}
		
		throw new IllegalArgumentException("Invalid DALL-E model '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return model;
	}
}
