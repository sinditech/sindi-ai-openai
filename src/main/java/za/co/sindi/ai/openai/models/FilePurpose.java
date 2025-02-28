/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/files/create">Files</a>
 */
public enum FilePurpose {
	ASSISTANTS("assistants")
	,ASSISTANTS_OUTPUT("assistants_output")
	,BATCH("batch")
	,BATCH_OUTPUT("batch_output")
	,FINE_TUNE("fine-tune")
	,FINE_TUNE_RESULTS("fine-tune-results")
	,VISION("vision")
	
	;
	private final String format;

	/**
	 * @param format
	 */
	private FilePurpose(String format) {
		this.format = format;
	}
	
	public static FilePurpose of(final String value) {
		for (FilePurpose format : values()) {
			if (format.format.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid file purpose '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return format;
	}
}
