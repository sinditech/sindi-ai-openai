/**
 * 
 */
package za.co.sindi.ai.openai.assistants;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.ai.openai.models.SortOrder;
import za.co.sindi.commons.net.URIBuilder;
import za.co.sindi.commons.utils.Strings;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class ListAssistantRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/assistants";
	
	private Integer limit;
	private SortOrder order;
	private String before;
	private String after;

	/**
	 * @param assistantId
	 */
	public ListAssistantRequest(final String assistantId) {
		this(URI, assistantId);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param assistantId
	 */
	public ListAssistantRequest(final String uri, final String assistantId) {
		super("GET", uri + "/" + assistantId);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the limit
	 */
	public Integer getLimit() {
		return limit;
	}

	/**
	 * @param limit the limit to set
	 */
	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	/**
	 * @return the order
	 */
	public SortOrder getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(SortOrder order) {
		this.order = order;
	}

	/**
	 * @return the before
	 */
	public String getBefore() {
		return before;
	}

	/**
	 * @param before the before to set
	 */
	public void setBefore(String before) {
		this.before = before;
	}

	/**
	 * @return the after
	 */
	public String getAfter() {
		return after;
	}

	/**
	 * @param after the after to set
	 */
	public void setAfter(String after) {
		this.after = after;
	}

	/* (non-Javadoc)
	 * @see za.co.sindi.ai.openai.OpenAIRequest#getUri()
	 */
	
	@Override
	public java.net.URI getUri() {
		// TODO Auto-generated method stub
		URIBuilder uriBuilder = new URIBuilder(super.getUri());
		if (limit != null) {
			uriBuilder.addQueryParameters("limit", String.valueOf(limit));
		}
		if (order != null) {
			uriBuilder.addQueryParameters("order", order.toString());
		}
		if (!Strings.isNullOrEmpty(after)) {
			uriBuilder.addQueryParameters("after", after);
		}
		if (!Strings.isNullOrEmpty(before)) {
			uriBuilder.addQueryParameters("before", before);
		}
		return uriBuilder.build();
	}
}
