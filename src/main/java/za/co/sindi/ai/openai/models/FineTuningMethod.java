/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 28 February 2025
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="supervised", type=SupervisedFineTuningMethod.class),
	    @JsonbSubtype(alias="dpo", type=DPOFineTuningMethod.class),
	}
)
public abstract class FineTuningMethod implements Serializable {
	
	@JsonbProperty("hyperparameters")
	private FineTuningHyperParameters hyperParameters;

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
}
