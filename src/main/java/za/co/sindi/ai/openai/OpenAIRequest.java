/**
 * 
 */
package za.co.sindi.ai.openai;

import java.net.URI;
import java.util.Objects;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 */
public abstract class OpenAIRequest {
	
	protected static final String HOST_API_PATH = "https://api.openai.com/v1"; //"http://zanino.millennium.berkeley.edu:8000/v1"; // For test "https://api.pawan.krd/v1"; //
	
	private final String method;
	private final URI uri;
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
		this.uri = URI.create(Objects.requireNonNull(uri));
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
	public URI getUri() {
		return uri;
	}
}
