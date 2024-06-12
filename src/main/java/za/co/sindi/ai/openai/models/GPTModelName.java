/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/models/overview">Model Overview</a>
 */
public enum GPTModelName {
	GPT_3_5_TURBO("gpt-3.5-turbo")
	,GPT_3_5_TURBO_0125("gpt-3.5-turbo-0125")
	,GPT_3_5_TURBO_INSTRUCT("gpt-3.5-turbo-instruct")
	,GPT_4o("gpt-4o")
	,GPT_4("gpt-4")
	,GPT_4_TURBO_PREVIEW("gpt-4-turbo-preview")
	,GPT_4_0125_PREVIEW("gpt-4-0125-preview")
	,GPT_4_1106_PREVIEW("gpt-4-1106-preview")
	,GPT_4_VISION_PREVIEW("gpt-4-vision-preview")
	,GPT_4_1106_VISION_PREVIEW("gpt-4-1106-vision-preview")
	;
	private final String model;

	/**
	 * @param model
	 */
	private GPTModelName(String model) {
		this.model = model;
	}
	
	public static GPTModelName getLatest() {
		return GPT_4o;
	}
	
	public static GPTModelName of(final String value) {
		for (GPTModelName model : values()) {
			if (model.model.equals(value)) return model;
		}
		
		throw new IllegalArgumentException("Invalid GPT model '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return model;
	}
}
