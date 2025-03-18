/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/models/tts">TTS Model</a>
 */
public enum FinishReason {
	STOP("stop")
	,LENGTH("length")
	,CONTENT_FILTER("content_filter")
	,TOOL_CALLS("tool_calls")
	,@Deprecated FUNCTION_CALL("function_call")
	;
	private final String reason;

	/**
	 * @param reason
	 */
	private FinishReason(String reason) {
		this.reason = reason;
	}
	
	public static FinishReason of(final String value) {
		for (FinishReason reason : values()) {
			if (reason.reason.equals(value)) return reason;
		}
		
		throw new IllegalArgumentException("Invalid Finish Reason '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return reason;
	}
}
