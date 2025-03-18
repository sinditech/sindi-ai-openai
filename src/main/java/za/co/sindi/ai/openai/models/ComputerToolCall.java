package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class ComputerToolCall extends Item {

	@JsonbProperty
	private ComputerAction action;
	
	@JsonbProperty("call_id")
	private String callId;
	
	@JsonbProperty
	private String id;
	
	@JsonbProperty("pending_safety_checks")
	private SafetyCheck[] pendingSafetyChecks;

	/**
	 * @return the action
	 */
	public ComputerAction getAction() {
		return action;
	}

	/**
	 * @param action the action to set
	 */
	public void setAction(ComputerAction action) {
		this.action = action;
	}

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
	 * @return the pendingSafetyChecks
	 */
	public SafetyCheck[] getPendingSafetyChecks() {
		return pendingSafetyChecks;
	}

	/**
	 * @param pendingSafetyChecks the pendingSafetyChecks to set
	 */
	public void setPendingSafetyChecks(SafetyCheck[] pendingSafetyChecks) {
		this.pendingSafetyChecks = pendingSafetyChecks;
	}
}
