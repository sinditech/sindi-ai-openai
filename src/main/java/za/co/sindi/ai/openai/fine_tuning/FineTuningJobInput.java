/**
 * 
 */
package za.co.sindi.ai.openai.fine_tuning;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.openai.models.FineTuningHyperParameters;

/**
 * @author Buhake Sindi
 * @since 25 January 2024
 */
public class FineTuningJobInput implements Serializable {

	@JsonbProperty
	private String model;
	
	@JsonbProperty("training_file")
	private String trainingFile;
	
	@JsonbProperty("hyperparameters")
	private FineTuningHyperParameters hyperParameters;
	
	@JsonbProperty
	private String suffix;
	
	@JsonbProperty("Validation_file")
	private String validationFile;

	/**
	 * 
	 */
	public FineTuningJobInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param model
	 * @param trainingFile
	 */
	public FineTuningJobInput(String model, String trainingFile) {
		super();
		this.model = model;
		this.trainingFile = trainingFile;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the trainingFile
	 */
	public String getTrainingFile() {
		return trainingFile;
	}

	/**
	 * @param trainingFile the trainingFile to set
	 */
	public void setTrainingFile(String trainingFile) {
		this.trainingFile = trainingFile;
	}

	/**
	 * @return the hyperParameters
	 */
	public FineTuningHyperParameters getHyperParameters() {
		return hyperParameters;
	}

	/**
	 * @param hyperParameters the hyperParameters to set
	 */
	public void setHyperParameters(FineTuningHyperParameters hyperParameters) {
		this.hyperParameters = hyperParameters;
	}

	/**
	 * @return the suffix
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * @param suffix the suffix to set
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/**
	 * @return the validationFile
	 */
	public String getValidationFile() {
		return validationFile;
	}

	/**
	 * @param validationFile the validationFile to set
	 */
	public void setValidationFile(String validationFile) {
		this.validationFile = validationFile;
	}
}
