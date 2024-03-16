/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/models/tts">Audio Response Format</a>
 */
public enum AudioSpeechResponseFormat {
	MP3("mp3")
	,OPUS("opus")
	,AAC("aac")
	,FLAC("flac")
	,WAV("wav")
	,PCM("pcm")
	;
	private final String format;

	/**
	 * @param format
	 */
	private AudioSpeechResponseFormat(String format) {
		this.format = format;
	}
	
	public static AudioSpeechResponseFormat of(final String value) {
		for (AudioSpeechResponseFormat format : values()) {
			if (format.format.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid Audio speech response format '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return format;
	}
}
