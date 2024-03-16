/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/models/tts">Audio Transcription Format</a>
 */
public enum AudioTranscriptResponseFormat {
	JSON("json")
	,TEXT("text")
	,SRT("srt")
	,VERBOSE_JSON("verbose_json")
	,VTT("vtt")
	;
	private final String format;

	/**
	 * @param format
	 */
	private AudioTranscriptResponseFormat(String format) {
		this.format = format;
	}
	
	public static AudioTranscriptResponseFormat of(final String value) {
		for (AudioTranscriptResponseFormat format : values()) {
			if (format.format.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid Audio transcript response format '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return format;
	}
}
