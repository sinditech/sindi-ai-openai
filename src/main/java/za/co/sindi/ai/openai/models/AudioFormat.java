/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/create#chat-create-audio">Audio Format</a>
 */
public enum AudioFormat {
	MP3("mp3")
	,OPUS("opus")
	,FLAC("flac")
	,WAV("wav")
	,PCM16("pcm16")
	;
	private final String format;

	/**
	 * @param format
	 */
	private AudioFormat(String format) {
		this.format = format;
	}
	
	public static AudioFormat of(final String value) {
		for (AudioFormat format : values()) {
			if (format.format.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid Audio format '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return format;
	}
}
