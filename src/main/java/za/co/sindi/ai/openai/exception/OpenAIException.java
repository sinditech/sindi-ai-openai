/**
 * 
 */
package za.co.sindi.ai.openai.exception;

import za.co.sindi.ai.openai.models.APIError;

/**
 * @author Buhake Sindi
 * @since 26 January 2024
 */
public class OpenAIException extends RuntimeException {

	private APIError error;

	/**
	 * @param error
	 */
	public OpenAIException(APIError error) {
		super(error.getMessage());
		this.error = error;
	}

	/**
	 * @return the error
	 */
	public APIError getError() {
		return error;
	}
}
