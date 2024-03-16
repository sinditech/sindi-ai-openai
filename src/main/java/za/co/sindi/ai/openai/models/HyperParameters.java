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
public class HyperParameters implements Serializable {

	@JsonbProperty("n_epochs")
	private long numberOfEpochs;

	/**
	 * @return the numberOfEpochs
	 */
	public long getNumberOfEpochs() {
		return numberOfEpochs;
	}

	/**
	 * @param numberOfEpochs the numberOfEpochs to set
	 */
	public void setNumberOfEpochs(long numberOfEpochs) {
		this.numberOfEpochs = numberOfEpochs;
	}
}
