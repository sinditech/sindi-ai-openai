/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 25 January 2024
 */
public class FineTuningJob implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty("created_at")
	private long createdAt;
	
	@JsonbProperty
	private FineTuningJobError error;
	
	@JsonbProperty
	private String fineTunedModel;
	
	@JsonbProperty("finished_at")
	private long finishedAt;
	
	@JsonbProperty("hyperparameters")
	private HyperParameters hyperParameters;
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private String object;
	
	@JsonbProperty("organization_id")
	private String organizationId;
	
	@JsonbProperty("result_files")
	private String[] resultFiles;
	
	@JsonbProperty
	private FineTuningJobStatus status;
	
	@JsonbProperty("trained_tokens")
	private Long trainedTokens;
	
	@JsonbProperty("training_file")
	private String trainingFile;
	
	@JsonbProperty("Validation_file")
	private String validationFile;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the createdAt
	 */
	public long getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the error
	 */
	public FineTuningJobError getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(FineTuningJobError error) {
		this.error = error;
	}

	/**
	 * @return the fineTunedModel
	 */
	public String getFineTunedModel() {
		return fineTunedModel;
	}

	/**
	 * @param fineTunedModel the fineTunedModel to set
	 */
	public void setFineTunedModel(String fineTunedModel) {
		this.fineTunedModel = fineTunedModel;
	}

	/**
	 * @return the finishedAt
	 */
	public long getFinishedAt() {
		return finishedAt;
	}

	/**
	 * @param finishedAt the finishedAt to set
	 */
	public void setFinishedAt(long finishedAt) {
		this.finishedAt = finishedAt;
	}

	/**
	 * @return the hyperParameters
	 */
	public HyperParameters getHyperParameters() {
		return hyperParameters;
	}

	/**
	 * @param hyperParameters the hyperParameters to set
	 */
	public void setHyperParameters(HyperParameters hyperParameters) {
		this.hyperParameters = hyperParameters;
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
	 * @return the object
	 */
	public String getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(String object) {
		this.object = object;
	}

	/**
	 * @return the organizationId
	 */
	public String getOrganizationId() {
		return organizationId;
	}

	/**
	 * @param organizationId the organizationId to set
	 */
	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	/**
	 * @return the resultFiles
	 */
	public String[] getResultFiles() {
		return resultFiles;
	}

	/**
	 * @param resultFiles the resultFiles to set
	 */
	public void setResultFiles(String[] resultFiles) {
		this.resultFiles = resultFiles;
	}

	/**
	 * @return the status
	 */
	public FineTuningJobStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(FineTuningJobStatus status) {
		this.status = status;
	}

	/**
	 * @return the trainedTokens
	 */
	public Long getTrainedTokens() {
		return trainedTokens;
	}

	/**
	 * @param trainedTokens the trainedTokens to set
	 */
	public void setTrainedTokens(Long trainedTokens) {
		this.trainedTokens = trainedTokens;
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
