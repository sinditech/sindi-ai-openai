/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/object">Response object</a>
 */
public enum Status {
	COMPLETED("completed")
	,FAILED("failed")
	,IN_PROGRESS("in_progress")
	,INCOMPLETE("incomplete")
	;
	private final String status;

	/**
	 * @param status
	 */
	private Status(String status) {
		this.status = status;
	}
	
	public static Status of(final String value) {
		for (Status status : values()) {
			if (status.status.equals(value)) return status;
		}
		
		throw new IllegalArgumentException("Invalid status '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return status;
	}
}
