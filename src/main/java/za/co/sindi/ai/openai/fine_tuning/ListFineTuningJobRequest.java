/**
 * 
 */
package za.co.sindi.ai.openai.fine_tuning;

import java.nio.charset.StandardCharsets;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.commons.utils.Strings;
import za.co.sindi.commons.utils.URLEncoderUtils;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class ListFineTuningJobRequest extends OpenAIRequest {

	private static final String URI = "/fine_tuning/jobs";
	
	private String after;
	
	private Integer limit;

	/**
	 *
	 */
	public ListFineTuningJobRequest() {
		this(URI);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 */
	public ListFineTuningJobRequest(final String uri) {
		super("GET", uri);
		// TODO Auto-generated constructor stub
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

	@Override
	public String getUri() {
		// TODO Auto-generated method stub
		String uri = super.getUri();
		StringBuilder sb = new StringBuilder();
		if (!Strings.isNullOrEmpty(getAfter())) {
			sb.append("after=" + getAfter());
		}
		
		if (getLimit() != null) {
			if (!sb.isEmpty()) sb.append("&");
			sb.append("limit=" + getLimit());
		}

		return uri + (sb.isEmpty() ? "" : "?"  + URLEncoderUtils.encodeQuery(sb.toString(), StandardCharsets.UTF_8));
	}
}
