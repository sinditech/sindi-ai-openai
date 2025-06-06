/**
 * 
 */
package za.co.sindi.ai.openai.fine_tuning;

import java.util.Objects;

import za.co.sindi.ai.openai.OpenAIRequest;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class CancelFineTuningJobRequest extends OpenAIRequest {

	private static final String URI = "/fine_tuning/jobs";
	
	/**
	 * @param fineTuningJobId
	 */
	public CancelFineTuningJobRequest(final String fineTuningJobId) {
		this(URI, fineTuningJobId);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param fineTuningJobId
	 */
	public CancelFineTuningJobRequest(final String uri, final String fineTuningJobId) {
		super("POST", uri + "/" + Objects.requireNonNull(fineTuningJobId, "'fine_tuning_job_id' is required.") + "/cancel");
		// TODO Auto-generated constructor stub
	}
}
