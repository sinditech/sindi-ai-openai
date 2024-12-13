/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/models/tts">Audio Response Format</a>
 */
public enum AudioVoice {
	ASH("ash")
	,BALLAD("ballad")
	,CORAL("coral")
	,SAGE("sage")
	,VERSE("verse")
	,ALLOY("alloy")
	,ECHO("echo")
	,SHIMMER("shimmer")
	;
	private final String voice;

	/**
	 * @param format
	 */
	private AudioVoice(String voice) {
		this.voice = voice;
	}
	
	public static AudioVoice of(final String voice) {
		for (AudioVoice audio : values()) {
			if (audio.voice.equals(voice)) return audio;
		}
		
		throw new IllegalArgumentException("Invalid Audio voice '" + voice + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return voice;
	}
}
