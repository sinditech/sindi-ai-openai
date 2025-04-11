/**
 * 
 */
package za.co.sindi.ai.openai;

import java.util.Objects;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 */
public abstract class OpenAIRequest {
	
	private final String method;
	private final String uri;
	private final String contentType;
	
	/**
	 * @param method
	 * @param uri
	 */
	protected OpenAIRequest(String method, String uri) {
		this(method, uri, null);
	}

	/**
	 * @param method
	 * @param uri
	 * @param contentType
	 */
	protected OpenAIRequest(String method, String uri, String contentType) {
		super();
		this.method = Objects.requireNonNull(method);
		this.uri = Objects.requireNonNull(uri);
		this.contentType = contentType;
	}

	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}
}
