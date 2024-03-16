/**
 * 
 */
package za.co.sindi.ai.openai.fine_tuning;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.ai.openai.models.FineTuningJobInput;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class CreateFineTuningJobRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/fine_tuning/jobs";
	
	private FineTuningJobInput input;
	
	/**
	 * @param model
	 * @param trainingFileId
	 */
	public CreateFineTuningJobRequest(final String model, final String trainingFileId) {
		this(new FineTuningJobInput(model, trainingFileId));
	}
	
	/**
	 * @param uri
	 * @param model
	 * @param trainingFileId
	 */
	public CreateFineTuningJobRequest(final String uri, final String model, final String trainingFileId) {
		this(uri, new FineTuningJobInput(model, trainingFileId));
	}

	/**
	 * @param input
	 */
	public CreateFineTuningJobRequest(final FineTuningJobInput input) {
		this(URI, input);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param input
	 */
	public CreateFineTuningJobRequest(final String uri, final FineTuningJobInput input) {
		super("POST", uri, "application/json");
		// TODO Auto-generated constructor stub
		this.input = input;
	}

	/**
	 * @return the input
	 */
	public FineTuningJobInput getInput() {
		return input;
	}
}
