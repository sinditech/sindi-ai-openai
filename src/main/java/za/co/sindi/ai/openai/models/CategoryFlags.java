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
public class CategoryFlags implements Serializable {

	@JsonbProperty
	private boolean hate;
	
	@JsonbProperty("hate/threatening")
	private boolean hateIncludesThreatening;
	
	@JsonbProperty
	private boolean harassment;
	
	@JsonbProperty("harassment/threatening")
	private boolean harassmentIncludesThreatening;
	
	@JsonbProperty
	private boolean illicit;
	
	@JsonbProperty("illicit/violence")
	private boolean illicitIncludesViolence;
	
	@JsonbProperty("self-harm")
	private boolean selfHarm;
	
	@JsonbProperty("self-harm/intent")
	private boolean selfHarmIncludesIntent;
	
	@JsonbProperty("self-harm/instructions")
	private boolean selfHarmIncludesInstructions;
	
	@JsonbProperty
	private boolean sexual;
	
	@JsonbProperty("sexual/minors")
	private boolean sexualIncludesMinors;
	
	@JsonbProperty
	private boolean violence;
	
	@JsonbProperty("violence/graphic")
	private boolean violenceIncludesGraphic;

	/**
	 * @return the hate
	 */
	public boolean isHate() {
		return hate;
	}

	/**
	 * @param hate the hate to set
	 */
	public void setHate(boolean hate) {
		this.hate = hate;
	}

	/**
	 * @return the hateIncludesThreatening
	 */
	public boolean isHateIncludesThreatening() {
		return hateIncludesThreatening;
	}

	/**
	 * @param hateIncludesThreatening the hateIncludesThreatening to set
	 */
	public void setHateIncludesThreatening(boolean hateIncludesThreatening) {
		this.hateIncludesThreatening = hateIncludesThreatening;
	}

	/**
	 * @return the harassment
	 */
	public boolean isHarassment() {
		return harassment;
	}

	/**
	 * @param harassment the harassment to set
	 */
	public void setHarassment(boolean harassment) {
		this.harassment = harassment;
	}

	/**
	 * @return the harassmentIncludesThreatening
	 */
	public boolean isHarassmentIncludesThreatening() {
		return harassmentIncludesThreatening;
	}

	/**
	 * @param harassmentIncludesThreatening the harassmentIncludesThreatening to set
	 */
	public void setHarassmentIncludesThreatening(boolean harassmentIncludesThreatening) {
		this.harassmentIncludesThreatening = harassmentIncludesThreatening;
	}

	/**
	 * @return the illicit
	 */
	public boolean isIllicit() {
		return illicit;
	}

	/**
	 * @param illicit the illicit to set
	 */
	public void setIllicit(boolean illicit) {
		this.illicit = illicit;
	}

	/**
	 * @return the illicitIncludesViolence
	 */
	public boolean isIllicitIncludesViolence() {
		return illicitIncludesViolence;
	}

	/**
	 * @param illicitIncludesViolence the illicitIncludesViolence to set
	 */
	public void setIllicitIncludesViolence(boolean illicitIncludesViolence) {
		this.illicitIncludesViolence = illicitIncludesViolence;
	}

	/**
	 * @return the selfHarm
	 */
	public boolean isSelfHarm() {
		return selfHarm;
	}

	/**
	 * @param selfHarm the selfHarm to set
	 */
	public void setSelfHarm(boolean selfHarm) {
		this.selfHarm = selfHarm;
	}

	/**
	 * @return the selfHarmIncludesIntent
	 */
	public boolean isSelfHarmIncludesIntent() {
		return selfHarmIncludesIntent;
	}

	/**
	 * @param selfHarmIncludesIntent the selfHarmIncludesIntent to set
	 */
	public void setSelfHarmIncludesIntent(boolean selfHarmIncludesIntent) {
		this.selfHarmIncludesIntent = selfHarmIncludesIntent;
	}

	/**
	 * @return the selfHarmIncludesInstructions
	 */
	public boolean isSelfHarmIncludesInstructions() {
		return selfHarmIncludesInstructions;
	}

	/**
	 * @param selfHarmIncludesInstructions the selfHarmIncludesInstructions to set
	 */
	public void setSelfHarmIncludesInstructions(boolean selfHarmIncludesInstructions) {
		this.selfHarmIncludesInstructions = selfHarmIncludesInstructions;
	}

	/**
	 * @return the sexual
	 */
	public boolean isSexual() {
		return sexual;
	}

	/**
	 * @param sexual the sexual to set
	 */
	public void setSexual(boolean sexual) {
		this.sexual = sexual;
	}

	/**
	 * @return the sexualIncludesMinors
	 */
	public boolean isSexualIncludesMinors() {
		return sexualIncludesMinors;
	}

	/**
	 * @param sexualIncludesMinors the sexualIncludesMinors to set
	 */
	public void setSexualIncludesMinors(boolean sexualIncludesMinors) {
		this.sexualIncludesMinors = sexualIncludesMinors;
	}

	/**
	 * @return the violence
	 */
	public boolean isViolence() {
		return violence;
	}

	/**
	 * @param violence the violence to set
	 */
	public void setViolence(boolean violence) {
		this.violence = violence;
	}

	/**
	 * @return the violenceIncludesGraphic
	 */
	public boolean isViolenceIncludesGraphic() {
		return violenceIncludesGraphic;
	}

	/**
	 * @param violenceIncludesGraphic the violenceIncludesGraphic to set
	 */
	public void setViolenceIncludesGraphic(boolean violenceIncludesGraphic) {
		this.violenceIncludesGraphic = violenceIncludesGraphic;
	}
}
