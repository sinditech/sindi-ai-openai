/**
 * 
 */
package za.co.sindi.ai.openai.response;

import java.util.Objects;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.commons.net.URIBuilder;
import za.co.sindi.commons.utils.Strings;

/**
 *  @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/input-items">List input items</a>
 */
public class GetModelResponseRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/responses";
	
	private ModelInclude[] include;

	/**
	 * @param responseId
	 */
	public GetModelResponseRequest(final String responseId) {
		this(URI, responseId);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param model
	 */
	public GetModelResponseRequest(final String uri, final String responseId) {
		super("GET", uri + "/" + Objects.requireNonNull(responseId));
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param include the include to set
	 */
	public void setInclude(ModelInclude[] include) {
		this.include = include;
	}

	/**
	 * @return the include
	 */
	public ModelInclude[] getInclude() {
		return include;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIRequest#getUri()
	 */
	@Override
	public java.net.URI getUri() {
		// TODO Auto-generated method stub
		URIBuilder uriBuilder = new URIBuilder(super.getUri());
		if (include != null) {
			uriBuilder.addQueryParameters("include", Strings.join(",", include));
		}
		return uriBuilder.build();
	}
}
