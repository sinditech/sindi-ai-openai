/**
 * 
 */
package za.co.sindi.ai.openai.files;

import java.nio.charset.StandardCharsets;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.ai.openai.models.FilePurpose;
import za.co.sindi.commons.utils.URLEncoderUtils;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class ListFileRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/files";
	
	private FilePurpose purpose;
	
	/**
	 *
	 */
	public ListFileRequest() {
		this(URI);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 */
	public ListFileRequest(final String uri) {
		super("GET", uri);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the purpose
	 */
	public FilePurpose getPurpose() {
		return purpose;
	}

	/**
	 * @param purpose the purpose to set
	 */
	public void setPurpose(FilePurpose purpose) {
		this.purpose = purpose;
	}

	@Override
	public java.net.URI getUri() {
		// TODO Auto-generated method stub
		String uri = super.getUri().toString();
		StringBuilder sb = new StringBuilder();
		
		if (getPurpose() != null) {
			sb.append("purpose=" + getPurpose());
		}

		return java.net.URI.create(uri + (sb.isEmpty() ? "" : "?"  + URLEncoderUtils.encodeQuery(sb.toString(), StandardCharsets.UTF_8)));
	}
}
