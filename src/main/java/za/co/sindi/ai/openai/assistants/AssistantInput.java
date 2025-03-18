/**
 * 
 */
package za.co.sindi.ai.openai.assistants;

import java.io.Serializable;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.openai.images.AssistantTool;
import za.co.sindi.ai.openai.models.ReasoningEffort;
import za.co.sindi.ai.openai.models.ResponseFormat;
import za.co.sindi.ai.openai.models.ToolResource;

/**
 * @author Buhake Sindi
 * @since 26 February 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/assistants">Assistants - OpenAI API reference documentation.</a>
 */
public class AssistantInput implements Serializable {
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private String description;

	@JsonbProperty
	private String instructions;
	
	@JsonbProperty("reasoning_effort")
	private ReasoningEffort reasoningEffort;
	
	@JsonbProperty("response_format")
	private ResponseFormat responseFormat;
	
	@JsonbProperty
	private Double temperature;
	
	@JsonbProperty
	private AssistantTool[] tools;
	
	@JsonbProperty
	private ToolResource[] toolResources;
	
	@JsonbProperty
	private Map<String, Object> metadata;
	
	@JsonbProperty("top_p")
	private Double topP;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * @return the reasoningEffort
	 */
	public ReasoningEffort getReasoningEffort() {
		return reasoningEffort;
	}

	/**
	 * @param reasoningEffort the reasoningEffort to set
	 */
	public void setReasoningEffort(ReasoningEffort reasoningEffort) {
		this.reasoningEffort = reasoningEffort;
	}

	/**
	 * @return the responseFormat
	 */
	public ResponseFormat getResponseFormat() {
		return responseFormat;
	}

	/**
	 * @param responseFormat the responseFormat to set
	 */
	public void setResponseFormat(ResponseFormat responseFormat) {
		this.responseFormat = responseFormat;
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
	 * @return the tools
	 */
	public AssistantTool[] getTools() {
		return tools;
	}

	/**
	 * @param tools the tools to set
	 */
	public void setTools(AssistantTool[] tools) {
		this.tools = tools;
	}

	/**
	 * @return the toolResources
	 */
	public ToolResource[] getToolResources() {
		return toolResources;
	}

	/**
	 * @param toolResources the toolResources to set
	 */
	public void setToolResources(ToolResource[] toolResources) {
		this.toolResources = toolResources;
	}

	/**
	 * @return the metadata
	 */
	public Map<String, Object> getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
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
}
