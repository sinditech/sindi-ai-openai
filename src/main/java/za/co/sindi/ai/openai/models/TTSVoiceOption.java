/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/guides/text-to-speech/voice-options">Voice Options.</a>
 */
public enum TTSVoiceOption {
	ALLOY("alloy")
	,ECHO("echo")
	,FABLE("fable")
	,ONYX("onyx")
	,NOVA("nova")
	,SHIMMER("shimmer")
	;
	private final String voice;

	/**
	 * @param model
	 */
	private TTSVoiceOption(String voice) {
		this.voice = voice;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return voice;
	}
}
