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
public class CategoryScores implements Serializable {

	@JsonbProperty
	private float hate;
	
	@JsonbProperty("hate/threatening")
	private float hateIncludesThreatening;
	
	@JsonbProperty
	private float harassment;
	
	@JsonbProperty("harassment/threatening")
	private float harassmentIncludesThreatening;
	
	@JsonbProperty("self_harm")
	private float selfHarm;
	
	@JsonbProperty("self_harm/intent")
	private float selfHarmIncludesIntent;
	
	@JsonbProperty("self_harm/instructions")
	private float selfHarmIncludesInstructions;
	
	@JsonbProperty
	private float sexual;
	
	@JsonbProperty("sexual/minors")
	private float sexualIncludesMinors;
	
	@JsonbProperty
	private float violence;
	
	@JsonbProperty("violence/graphic")
	private float violenceIncludesGraphic;

	/**
	 * @return the hate
	 */
	public float getHate() {
		return hate;
	}

	/**
	 * @param hate the hate to set
	 */
	public void setHate(float hate) {
		this.hate = hate;
	}

	/**
	 * @return the hateIncludesThreatening
	 */
	public float getHateIncludesThreatening() {
		return hateIncludesThreatening;
	}

	/**
	 * @param hateIncludesThreatening the hateIncludesThreatening to set
	 */
	public void setHateIncludesThreatening(float hateIncludesThreatening) {
		this.hateIncludesThreatening = hateIncludesThreatening;
	}

	/**
	 * @return the harassment
	 */
	public float getHarassment() {
		return harassment;
	}

	/**
	 * @param harassment the harassment to set
	 */
	public void setHarassment(float harassment) {
		this.harassment = harassment;
	}

	/**
	 * @return the harassmentIncludesThreatening
	 */
	public float getHarassmentIncludesThreatening() {
		return harassmentIncludesThreatening;
	}

	/**
	 * @param harassmentIncludesThreatening the harassmentIncludesThreatening to set
	 */
	public void setHarassmentIncludesThreatening(float harassmentIncludesThreatening) {
		this.harassmentIncludesThreatening = harassmentIncludesThreatening;
	}

	/**
	 * @return the selfHarm
	 */
	public float getSelfHarm() {
		return selfHarm;
	}

	/**
	 * @param selfHarm the selfHarm to set
	 */
	public void setSelfHarm(float selfHarm) {
		this.selfHarm = selfHarm;
	}

	/**
	 * @return the selfHarmIncludesIntent
	 */
	public float getSelfHarmIncludesIntent() {
		return selfHarmIncludesIntent;
	}

	/**
	 * @param selfHarmIncludesIntent the selfHarmIncludesIntent to set
	 */
	public void setSelfHarmIncludesIntent(float selfHarmIncludesIntent) {
		this.selfHarmIncludesIntent = selfHarmIncludesIntent;
	}

	/**
	 * @return the selfHarmIncludesInstructions
	 */
	public float getSelfHarmIncludesInstructions() {
		return selfHarmIncludesInstructions;
	}

	/**
	 * @param selfHarmIncludesInstructions the selfHarmIncludesInstructions to set
	 */
	public void setSelfHarmIncludesInstructions(float selfHarmIncludesInstructions) {
		this.selfHarmIncludesInstructions = selfHarmIncludesInstructions;
	}

	/**
	 * @return the sexual
	 */
	public float getSexual() {
		return sexual;
	}

	/**
	 * @param sexual the sexual to set
	 */
	public void setSexual(float sexual) {
		this.sexual = sexual;
	}

	/**
	 * @return the sexualIncludesMinors
	 */
	public float getSexualIncludesMinors() {
		return sexualIncludesMinors;
	}

	/**
	 * @param sexualIncludesMinors the sexualIncludesMinors to set
	 */
	public void setSexualIncludesMinors(float sexualIncludesMinors) {
		this.sexualIncludesMinors = sexualIncludesMinors;
	}

	/**
	 * @return the violence
	 */
	public float getViolence() {
		return violence;
	}

	/**
	 * @param violence the violence to set
	 */
	public void setViolence(float violence) {
		this.violence = violence;
	}

	/**
	 * @return the violenceIncludesGraphic
	 */
	public float getViolenceIncludesGraphic() {
		return violenceIncludesGraphic;
	}

	/**
	 * @param violenceIncludesGraphic the violenceIncludesGraphic to set
	 */
	public void setViolenceIncludesGraphic(float violenceIncludesGraphic) {
		this.violenceIncludesGraphic = violenceIncludesGraphic;
	}
}
