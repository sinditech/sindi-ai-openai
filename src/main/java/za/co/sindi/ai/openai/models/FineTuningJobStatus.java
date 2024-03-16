/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/fine-tuning/object">Fine-tuning Job object</a>
 */
public enum FineTuningJobStatus {
	VALIDATING_FILES("validating_files")
	,QUEUED("queued")
	,RUNNING("running")
	,SUCCEEDED("succeeded")
	,FAILED("failed")
	,CANCELLED("cancelled")
	;
	private final String format;

	/**
	 * @param format
	 */
	private FineTuningJobStatus(String format) {
		this.format = format;
	}
	
	public static FineTuningJobStatus of(final String value) {
		for (FineTuningJobStatus format : values()) {
			if (format.format.equals(value)) return format;
		}
		
		throw new IllegalArgumentException("Invalid fine-tuning job status '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return format;
	}
}
