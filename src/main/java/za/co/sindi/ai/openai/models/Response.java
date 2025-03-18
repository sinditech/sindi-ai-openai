package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class Response implements Serializable {

	@JsonbProperty("created_at")
	private long createdAt;
	
	@JsonbProperty
	private Error error;
	
	@JsonbProperty
	private String id;
	
	@JsonbProperty("incomplete_details")
	private IncompleteDetails incompleteDetails;
	
	@JsonbProperty
	private String instructions;
	
	@JsonbProperty("max_output_tokens")
	private Integer maximumOutputTokens;
	
	@JsonbProperty
	private Map<String, String> metadata;
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private String object;
	
	@JsonbProperty
	private Item[] output;
	
	@JsonbProperty("output_text")
	private String sdkOnlyOutputText;
	
	@JsonbProperty("parallel_tool_calls")
	private Boolean parallelToolCalls;
	
	@JsonbProperty("previous_response_id")
	private String previousResponseId;
	
	@JsonbProperty
	private ReasoningOption reasoning;
	
	@JsonbProperty
	private Status status;
	
	@JsonbProperty
	private Double temperature;
	
	@JsonbProperty
	private Text text;
	
	@JsonbProperty("tool_choice")
	public Object toolChoice;
	
	@JsonbProperty
	private ResponseTool[] tools;
	
	@JsonbProperty("top_p")
	private Double topP;
	
	@JsonbProperty
	private TruncationStrategy truncation;

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
	public Error getError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(Error error) {
		this.error = error;
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
	 * @return the incompleteDetails
	 */
	public IncompleteDetails getIncompleteDetails() {
		return incompleteDetails;
	}

	/**
	 * @param incompleteDetails the incompleteDetails to set
	 */
	public void setIncompleteDetails(IncompleteDetails incompleteDetails) {
		this.incompleteDetails = incompleteDetails;
	}

	/**
	 * @return the instructions
	 */
	public String getInstructions() {
		return instructions;
	}

	/**
	 * @param instructions the instructions to set
	 */
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	/**
	 * @return the maximumOutputTokens
	 */
	public Integer getMaximumOutputTokens() {
		return maximumOutputTokens;
	}

	/**
	 * @param maximumOutputTokens the maximumOutputTokens to set
	 */
	public void setMaximumOutputTokens(Integer maximumOutputTokens) {
		this.maximumOutputTokens = maximumOutputTokens;
	}

	/**
	 * @return the metadata
	 */
	public Map<String, String> getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
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
	 * @return the output
	 */
	public Item[] getOutput() {
		return output;
	}

	/**
	 * @param output the output to set
	 */
	public void setOutput(Item[] output) {
		this.output = output;
	}

	/**
	 * @return the sdkOnlyOutputText
	 */
	public String getSdkOnlyOutputText() {
		return sdkOnlyOutputText;
	}

	/**
	 * @param sdkOnlyOutputText the sdkOnlyOutputText to set
	 */
	public void setSdkOnlyOutputText(String sdkOnlyOutputText) {
		this.sdkOnlyOutputText = sdkOnlyOutputText;
	}

	/**
	 * @return the parallelToolCalls
	 */
	public Boolean getParallelToolCalls() {
		return parallelToolCalls;
	}

	/**
	 * @param parallelToolCalls the parallelToolCalls to set
	 */
	public void setParallelToolCalls(Boolean parallelToolCalls) {
		this.parallelToolCalls = parallelToolCalls;
	}

	/**
	 * @return the previousResponseId
	 */
	public String getPreviousResponseId() {
		return previousResponseId;
	}

	/**
	 * @param previousResponseId the previousResponseId to set
	 */
	public void setPreviousResponseId(String previousResponseId) {
		this.previousResponseId = previousResponseId;
	}

	/**
	 * @return the reasoning
	 */
	public ReasoningOption getReasoning() {
		return reasoning;
	}

	/**
	 * @param reasoning the reasoning to set
	 */
	public void setReasoning(ReasoningOption reasoning) {
		this.reasoning = reasoning;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @return the temperature
	 */
	public Double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the text
	 */
	public Text getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(Text text) {
		this.text = text;
	}

	/**
	 * @return the toolChoice
	 */
	public Object getToolChoice() {
		return toolChoice;
	}

	/**
	 * @param toolChoice the toolChoice to set
	 */
	public void setToolChoice(Object toolChoice) {
		this.toolChoice = toolChoice;
	}

	/**
	 * @return the tools
	 */
	public ResponseTool[] getTools() {
		return tools;
	}

	/**
	 * @param tools the tools to set
	 */
	public void setTools(ResponseTool[] tools) {
		this.tools = tools;
	}

	/**
	 * @return the topP
	 */
	public Double getTopP() {
		return topP;
	}

	/**
	 * @param topP the topP to set
	 */
	public void setTopP(Double topP) {
		this.topP = topP;
	}

	/**
	 * @return the truncation
	 */
	public TruncationStrategy getTruncation() {
		return truncation;
	}

	/**
	 * @param truncation the truncation to set
	 */
	public void setTruncation(TruncationStrategy truncation) {
		this.truncation = truncation;
	}
}
