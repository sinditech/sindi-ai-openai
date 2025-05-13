/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 13 May 2025
 * @see <a href="https://platform.openai.com/docs/models#transcription">Transcription Model</a>
 */
public enum ToolSpecificModelName {
	GPT_4O_SEARCH_PREVIEW("gpt-4o-search-preview")
	,GPT_4O_SEARCH_PREVIEW_2025_03_11("gpt-4o-search-preview-2025-003-11")
	,GPT_4O_MINI_SEARCH_PREVIEW("gpt-4o-mini-search-preview")
	,GPT_4O_MINI_SEARCH_PREVIEW_2025_03_11("gpt-4o-mini-search-preview-2025-003-11")
	,COMPUTER_USE_PREVIEW("computer-use-preview")
	,COMPUTER_USE_PREVIEW_2025_03_11("computer-use-preview-2025-03-11")
	;
	private final String model;

	/**
	 * @param model
	 */
	private ToolSpecificModelName(String model) {
		this.model = model;
	}
	
	public static ToolSpecificModelName of(final String value) {
		for (ToolSpecificModelName model : values()) {
			if (model.model.equals(value)) return model;
		}
		
		throw new IllegalArgumentException("Invalid Transcription model '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return model;
	}
}
