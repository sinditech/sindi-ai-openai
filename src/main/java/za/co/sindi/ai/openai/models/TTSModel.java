/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/models/tts">TTS Model</a>
 */
public enum TTSModel {
	GPT_4O_MINI_TTS("gpt-4o-mini-tts")
	,TTS_1("tts-1")
	,TTS_1_HD("tts-1-hd")
	;
	private final String model;

	/**
	 * @param model
	 */
	private TTSModel(String model) {
		this.model = model;
	}
	
	public static TTSModel of(final String value) {
		for (TTSModel ttsModel : values()) {
			if (ttsModel.model.equals(value)) return ttsModel;
		}
		
		throw new IllegalArgumentException("Invalid Text to speech model '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return model;
	}
}
