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
public class DeleteFileRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/files";
	
	/**
	 * @param fileId
	 */
	public DeleteFileRequest(final String fileId) {
		this(URI, fileId);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param fileId
	 */
	public DeleteFileRequest(final String uri, final String fileId) {
		super("DELETE", uri + "/" + Objects.requireNonNull(fileId, "'file_id' is required."));
		// TODO Auto-generated constructor stub
	}
}
