/**
 * 
 */
package za.co.sindi.ai.openai.files;

import java.util.Objects;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class RetrieveFileRequest extends OpenAIRequest {

	private static final String URI = "/files";
	
	/**
	 * @param fileId
	 */
	public RetrieveFileRequest(final String fileId) {
		this(URI, fileId);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param fileId
	 */
	public RetrieveFileRequest(final String uri, final String fileId) {
		super("GET", uri + "/" + Objects.requireNonNull(fileId, "'file_id' is required."));
		// TODO Auto-generated constructor stub
	}
}
