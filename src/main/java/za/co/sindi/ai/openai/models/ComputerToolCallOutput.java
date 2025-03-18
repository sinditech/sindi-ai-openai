package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class ComputerToolCallOutput extends Item {

	@JsonbProperty("call_id")
	private String callId;
	
	@JsonbProperty
	private ComputerScreenshot output;
	
	@JsonbProperty
	private String id;
	
	@JsonbProperty("acknowledged_safety_checks")
	private SafetyCheck[] acknowledgedSafetyChecks;

	/**
	 * @return the callId
	 */
	public String getCallId() {
		return callId;
	}

	/**
	 * @param callId the callId to set
	 */
	public void setCallId(String callId) {
		this.callId = callId;
	}

	/**
	 * @return the output
	 */
	public ComputerScreenshot getOutput() {
		return output;
	}

	/**
	 * @param output the output to set
	 */
	public void setOutput(ComputerScreenshot output) {
		this.output = output;
	}

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
	 * @return the acknowledgedSafetyChecks
	 */
	public SafetyCheck[] getAcknowledgedSafetyChecks() {
		return acknowledgedSafetyChecks;
	}

	/**
	 * @param acknowledgedSafetyChecks the acknowledgedSafetyChecks to set
	 */
	public void setAcknowledgedSafetyChecks(SafetyCheck[] acknowledgedSafetyChecks) {
		this.acknowledgedSafetyChecks = acknowledgedSafetyChecks;
	}
}
