package za.co.sindi.ai.openai.response;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.openai.models.Item;
import za.co.sindi.ai.openai.models.ResponseTool;
import za.co.sindi.ai.openai.models.Text;
import za.co.sindi.ai.openai.models.ToolChoiceFunction;
import za.co.sindi.ai.openai.models.ToolChoiceMode;
import za.co.sindi.ai.openai.models.TruncationStrategy;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class ResponseInput implements Serializable {
	
	@JsonbProperty
	private List<Item> input;

	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private ModelInclude[] include;
	
	@JsonbProperty
	private String instructions;
	
	@JsonbProperty("max_output_tokens")
	private Integer maxOutputTokens;
	
	@JsonbProperty
	private Map<String,String> metadata;
	
	@JsonbProperty("parallel_tool_calls")
	private Boolean parallelToolCalls;
	
	@JsonbProperty("previous_model_id")
	private String previousResponseId;
	
	@JsonbProperty
	private Boolean store;
	
	@JsonbProperty
	private Boolean stream;

	@JsonbProperty
	private Double temperature;
	
	@JsonbProperty
	private Text text;
	
	@JsonbProperty("tool_choice")
	private Object toolChoice;
	
	@JsonbProperty
	private ResponseTool[] tools;
	
	@JsonbProperty("top_p")
	private Double topP;
	
	@JsonbProperty
	private TruncationStrategy truncation;
	
	@JsonbProperty
	private String user;
	
	/**
	 * @param input
	 * @param model
	 */
	public ResponseInput(List<Item> input, String model) {
		super();
		this.input = Objects.requireNonNull(input, "Input items are required.");
		this.model = Objects.requireNonNull(model, "A model ID is required.");
	}

	/**
	 * @return the input
	 */
	public List<Item> getInput() {
		return input;
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
	 * @return the include
	 */
	public ModelInclude[] getInclude() {
		return include;
	}

	/**
	 * @param include the include to set
	 */
	public void setInclude(ModelInclude[] include) {
		this.include = include;
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
	 * @return the maxOutputTokens
	 */
	public Integer getMaxOutputTokens() {
		return maxOutputTokens;
	}

	/**
	 * @param maxOutputTokens the maxOutputTokens to set
	 */
	public void setMaxOutputTokens(Integer maxOutputTokens) {
		this.maxOutputTokens = maxOutputTokens;
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
	 * @return the store
	 */
	public Boolean getStore() {
		return store;
	}

	/**
	 * @param store the store to set
	 */
	public void setStore(Boolean store) {
		this.store = store;
	}

	/**
	 * @return the stream
	 */
	public Boolean getStream() {
		return stream;
	}

	/**
	 * @param stream the stream to set
	 */
	public void setStream(Boolean stream) {
		this.stream = stream;
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
	 * @return the toolChoice
	 */
	public Object getToolChoice() {
		return toolChoice;
	}

	/**
	 * @param toolChoice the toolChoice to set
	 */
	public void setToolChoice(ToolChoiceMode toolChoice) {
		this.toolChoice = toolChoice;
	}
	
	/**
	 * @param toolChoice the toolChoice to set
	 */
	public void setToolChoice(ToolChoiceFunction toolChoice) {
		this.toolChoice = toolChoice;
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

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
}
