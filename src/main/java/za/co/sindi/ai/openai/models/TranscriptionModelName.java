/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 13 May 2025
 * @see <a href="https://platform.openai.com/docs/models#transcription">Transcription Model</a>
 */
public enum TranscriptionModelName {
	GPT_4O_TRANSCRIBE("gpt-4o-transcribe")
	,GPT_4O_MINI_TRANSCRIBE("gpt-4o-mini-transcribe")
	,WHISPER_1("whisper-1")
	;
	private final String model;

	/**
	 * @param model
	 */
	private TranscriptionModelName(String model) {
		this.model = model;
	}
	
	public static TranscriptionModelName of(final String value) {
		for (TranscriptionModelName model : values()) {
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
