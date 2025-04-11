/**
 * 
 */
package za.co.sindi.ai.openai.chat;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class UpdateCompletionRequest extends OpenAIRequest {

	private static final String URI = "/chat/completions";
	
	private Map<String, String> metadata;
	
	/**
	 * @param completionId
	 */
	public UpdateCompletionRequest(final String completionId) {
		this(URI, completionId, new HashMap<>());
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param completionId
	 * @param metadata
	 */
	public UpdateCompletionRequest(final String completionId, final Map<String, String> metadata) {
		this(URI, completionId, metadata);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param completionId
	 * @param metadata
	 */
	public UpdateCompletionRequest(final String uri, final String completionId, final Map<String, String> metadata) {
		super("POST", uri + "/" + Objects.requireNonNull(completionId));
		// TODO Auto-generated constructor stub
		this.metadata = Objects.requireNonNull(metadata);
	}

	/**
	 * @return the metadata
	 */
	public Map<String, String> getMetadata() {
		return metadata;
	}
}
