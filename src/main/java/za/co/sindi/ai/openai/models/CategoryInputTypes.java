/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 28 February 2025
 */
public class CategoryInputTypes implements Serializable {

	@JsonbProperty
	private String[] hate;
	
	@JsonbProperty("hate/threatening")
	private String[] hateIncludesThreatening;
	
	@JsonbProperty
	private String[] harassment;
	
	@JsonbProperty("harassment/threatening")
	private String[] harassmentIncludesThreatening;
	
	@JsonbProperty
	private String[] illicit;
	
	@JsonbProperty("illicit/violence")
	private String[] illicitIncludesViolence;
	
	@JsonbProperty("self-harm")
	private String[] selfHarm;
	
	@JsonbProperty("self-harm/intent")
	private String[] selfHarmIncludesIntent;
	
	@JsonbProperty("self-harm/instructions")
	private String[] selfHarmIncludesInstructions;
	
	@JsonbProperty
	private String[] sexual;
	
	@JsonbProperty("sexual/minors")
	private String[] sexualIncludesMinors;
	
	@JsonbProperty
	private String[] violence;
	
	@JsonbProperty("violence/graphic")
	private String[] violenceIncludesGraphic;

	/**
	 * @return the hate
	 */
	public String[] getHate() {
		return hate;
	}

	/**
	 * @param hate the hate to set
	 */
	public void setHate(String[] hate) {
		this.hate = hate;
	}

	/**
	 * @return the hateIncludesThreatening
	 */
	public String[] getHateIncludesThreatening() {
		return hateIncludesThreatening;
	}

	/**
	 * @param hateIncludesThreatening the hateIncludesThreatening to set
	 */
	public void setHateIncludesThreatening(String[] hateIncludesThreatening) {
		this.hateIncludesThreatening = hateIncludesThreatening;
	}

	/**
	 * @return the harassment
	 */
	public String[] getHarassment() {
		return harassment;
	}

	/**
	 * @param harassment the harassment to set
	 */
	public void setHarassment(String[] harassment) {
		this.harassment = harassment;
	}

	/**
	 * @return the harassmentIncludesThreatening
	 */
	public String[] getHarassmentIncludesThreatening() {
		return harassmentIncludesThreatening;
	}

	/**
	 * @param harassmentIncludesThreatening the harassmentIncludesThreatening to set
	 */
	public void setHarassmentIncludesThreatening(String[] harassmentIncludesThreatening) {
		this.harassmentIncludesThreatening = harassmentIncludesThreatening;
	}

	/**
	 * @return the illicit
	 */
	public String[] getIllicit() {
		return illicit;
	}

	/**
	 * @param illicit the illicit to set
	 */
	public void setIllicit(String[] illicit) {
		this.illicit = illicit;
	}

	/**
	 * @return the illicitIncludesViolence
	 */
	public String[] getIllicitIncludesViolence() {
		return illicitIncludesViolence;
	}

	/**
	 * @param illicitIncludesViolence the illicitIncludesViolence to set
	 */
	public void setIllicitIncludesViolence(String[] illicitIncludesViolence) {
		this.illicitIncludesViolence = illicitIncludesViolence;
	}

	/**
	 * @return the selfHarm
	 */
	public String[] getSelfHarm() {
		return selfHarm;
	}

	/**
	 * @param selfHarm the selfHarm to set
	 */
	public void setSelfHarm(String[] selfHarm) {
		this.selfHarm = selfHarm;
	}

	/**
	 * @return the selfHarmIncludesIntent
	 */
	public String[] getSelfHarmIncludesIntent() {
		return selfHarmIncludesIntent;
	}

	/**
	 * @param selfHarmIncludesIntent the selfHarmIncludesIntent to set
	 */
	public void setSelfHarmIncludesIntent(String[] selfHarmIncludesIntent) {
		this.selfHarmIncludesIntent = selfHarmIncludesIntent;
	}

	/**
	 * @return the selfHarmIncludesInstructions
	 */
	public String[] getSelfHarmIncludesInstructions() {
		return selfHarmIncludesInstructions;
	}

	/**
	 * @param selfHarmIncludesInstructions the selfHarmIncludesInstructions to set
	 */
	public void setSelfHarmIncludesInstructions(String[] selfHarmIncludesInstructions) {
		this.selfHarmIncludesInstructions = selfHarmIncludesInstructions;
	}

	/**
	 * @return the sexual
	 */
	public String[] getSexual() {
		return sexual;
	}

	/**
	 * @param sexual the sexual to set
	 */
	public void setSexual(String[] sexual) {
		this.sexual = sexual;
	}

	/**
	 * @return the sexualIncludesMinors
	 */
	public String[] getSexualIncludesMinors() {
		return sexualIncludesMinors;
	}

	/**
	 * @param sexualIncludesMinors the sexualIncludesMinors to set
	 */
	public void setSexualIncludesMinors(String[] sexualIncludesMinors) {
		this.sexualIncludesMinors = sexualIncludesMinors;
	}

	/**
	 * @return the violence
	 */
	public String[] getViolence() {
		return violence;
	}

	/**
	 * @param violence the violence to set
	 */
	public void setViolence(String[] violence) {
		this.violence = violence;
	}

	/**
	 * @return the violenceIncludesGraphic
	 */
	public String[] getViolenceIncludesGraphic() {
		return violenceIncludesGraphic;
	}

	/**
	 * @param violenceIncludesGraphic the violenceIncludesGraphic to set
	 */
	public void setViolenceIncludesGraphic(String[] violenceIncludesGraphic) {
		this.violenceIncludesGraphic = violenceIncludesGraphic;
	}
}
