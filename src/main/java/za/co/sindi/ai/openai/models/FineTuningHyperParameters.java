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
public class FineTuningHyperParameters implements Serializable {
	
	@JsonbProperty
	private Double beta;
	
	@JsonbProperty("batch_size")
	private Long batchSize;
	
	@JsonbProperty("learning_rate_multiplier")
	private Double learningRateMultiplier;

	@JsonbProperty("n_epochs")
	private Long numberOfEpochs;

	/**
	 * @return the beta
	 */
	public Double getBeta() {
		return beta;
	}

	/**
	 * @param beta the beta to set
	 */
	public void setBeta(Double beta) {
		this.beta = beta;
	}

	/**
	 * @return the batchSize
	 */
	public Long getBatchSize() {
		return batchSize;
	}

	/**
	 * @param batchSize the batchSize to set
	 */
	public void setBatchSize(Long batchSize) {
		this.batchSize = batchSize;
	}

	/**
	 * @return the learningRateMultiplier
	 */
	public Double getLearningRateMultiplier() {
		return learningRateMultiplier;
	}

	/**
	 * @param learningRateMultiplier the learningRateMultiplier to set
	 */
	public void setLearningRateMultiplier(Double learningRateMultiplier) {
		this.learningRateMultiplier = learningRateMultiplier;
	}

	/**
	 * @return the numberOfEpochs
	 */
	public Long getNumberOfEpochs() {
		return numberOfEpochs;
	}

	/**
	 * @param numberOfEpochs the numberOfEpochs to set
	 */
	public void setNumberOfEpochs(Long numberOfEpochs) {
		this.numberOfEpochs = numberOfEpochs;
	}
}
