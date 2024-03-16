/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 25 January 2024
 * @see <a href="https://platform.openai.com/docs/guides/error-codes">Error codes</a>
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="invalid_request_error", type=InvalidRequestError.class),
	    @JsonbSubtype(alias="rate_limit_error", type=RateLimitError.class),
	    @JsonbSubtype(alias="tokens_exceeded_error", type=TokensExceededError.class),
	    @JsonbSubtype(alias="authentication_error", type=AuthenticationError.class),
	    @JsonbSubtype(alias="not_found_error", type=NotFoundError.class),
	    @JsonbSubtype(alias="server_error", type=ServerError.class) ,
	    @JsonbSubtype(alias="permission_error", type=PermissionError.class) ,
	    @JsonbSubtype(alias="insufficient_quota", type=InsufficientQuotaError.class) 
	}
)
public abstract class APIError implements Serializable {

	@JsonbProperty
	private String message;
	
	@JsonbProperty
	private String param;
	
	@JsonbProperty
	private String code;
	
	private final int statusCode;

	/**
	 * @param statusCode
	 */
	protected APIError(int statusCode) {
		super();
		this.statusCode = statusCode;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the param
	 */
	public String getParam() {
		return param;
	}

	/**
	 * @param param the param to set
	 */
	public void setParam(String param) {
		this.param = param;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}
}
