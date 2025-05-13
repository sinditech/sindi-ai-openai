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
	GPT_4O_TRANSCRIBE("gpt-4o-transcribe")
	,GPT_4O_MINI_TRANSCRIBE("gpt-4o-mini-transcribe")
	,WHISPER_1("whisper-1")
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
