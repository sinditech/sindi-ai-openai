/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.openai.images.AssistantTool;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * 
 * @author Buhake Sindi
 * @since 25 February 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/assistants">Assistants - OpenAI API reference documentation.</a>
 */
public class Assistant implements Serializable {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private String object;

	@JsonbProperty("created_at")
	private long createdAt;
	
	@JsonbProperty
	private String name;
	
	@JsonbProperty
	private String description;
	
	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private String instructions;
	
	@JsonbProperty
	private AssistantTool[] tools;
	
	@JsonbProperty("tool_resources")
	private ToolResource[] toolResources;
	
	@JsonbProperty
	private Map<String, String> metadata;
	
	@JsonbProperty
	private Double temperature;
	
	@JsonbProperty("top_p")
	private Double topP;
	
	@JsonbProperty("response_format")
	private Object responseFormat;

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
	 * @return the responseFormat
	 */
	public Object getResponseFormat() {
		return responseFormat;
	}

	/**
	 * @param responseFormat the responseFormat to set
	 */
	public void setResponseFormat(ResponseFormat responseFormat) {
		this.responseFormat = responseFormat;
	}
	
	/**
	 * @param responseFormat the responseFormat to set
	 */
	public void setResponseFormat(String responseFormat) {
		this.responseFormat = responseFormat;
	}
}
