/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 26 January 2024
 * @see <a href="https://platform.openai.com/docs/guides/error-codes">Error codes</a>
 */
public class OpenAIError implements Serializable {

	@JsonbProperty
	private APIError error;

	/**
	 * @return the error
	 */
	public APIError getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(APIError error) {
		this.error = error;
	}
}
