/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/models/overview">Model Overview</a>
 */
public enum ImageGenerationModelName {
	GPT_IMAGE_1("gpt-image-1")
	,DALL_E_3("dall-e-3")
	,DALL_E_2("dall-e-2")
	;
	private final String model;

	/**
	 * @param model
	 */
	private ImageGenerationModelName(String model) {
		this.model = model;
	}
	
	public static ImageGenerationModelName of(final String value) {
		for (ImageGenerationModelName model : values()) {
			if (model.model.equals(value)) return model;
		}
		
		throw new IllegalArgumentException("Invalid image generation model '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return model;
	}
}
