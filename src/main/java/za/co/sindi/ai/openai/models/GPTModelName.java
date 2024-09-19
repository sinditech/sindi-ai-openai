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
	,GPT_3_5_TURBO_1106("gpt-3.5-turbo-1106")
	,GPT_3_5_TURBO_INSTRUCT("gpt-3.5-turbo-instruct")
	,GPT_4O("gpt-4o")
	,GPT_4O_2024_05_13("gpt-4o-2024-05-13")
	,GPT_4O_2024_08_06("gpt-4o-2024-08-06")
	,GPT_4O_MINI("gpt-4o-mini")
	,GPT_4O_MINI_2024_07_18("gpt-4o-mini-2024-07-18")
	,GPT_4("gpt-4")
	,GPT_4_0613("gpt-4-0613")
	,GPT_4_0314("gpt-4-0314")
	,GPT_4_TURBO("gpt-4-turbo")
	,GPT_4_TURBO_2024_04_09("gpt-4-turbo-2024-04-09")
	,GPT_4_TURBO_PREVIEW("gpt-4-turbo-preview")
	,GPT_4_0125_PREVIEW("gpt-4-0125-preview")
	,GPT_4_1106_PREVIEW("gpt-4-1106-preview")
	,GPT_4_VISION_PREVIEW("gpt-4-vision-preview")
	,GPT_4_1106_VISION_PREVIEW("gpt-4-1106-vision-preview")
	,GPT_O1_PREVIEW("o1-preview")
	,GPT_O1_PREVIEW_2024_09_12("o1-preview-2024-09-12")
	,GPT_O1_MINI("o1-mini")
	,GPT_O1_MINI_2024_09_12("o1-mini-2024-09-12")
	,CHATGPT_4O_LATEST("chatgpt-4o-latest")
	;
	private final String model;

	/**
	 * @param model
	 */
	private GPTModelName(String model) {
		this.model = model;
	}
	
	public static GPTModelName getLatest() {
		return CHATGPT_4O_LATEST;
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
