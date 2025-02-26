/**
 * 
 */
package za.co.sindi.ai.openai.assistants;

import java.io.Serializable;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.openai.models.Tool;
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
	private String reasoningEffort;
	
	@JsonbProperty
	private Tool[] tools;
	
	@JsonbProperty
	private ToolResource[] toolResources;
	
	@JsonbProperty
	private Map<String, Object> metadata;

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
	public String getReasoningEffort() {
		return reasoningEffort;
	}

	/**
	 * @param reasoningEffort the reasoningEffort to set
	 */
	public void setReasoningEffort(String reasoningEffort) {
		this.reasoningEffort = reasoningEffort;
	}

	/**
	 * @return the tools
	 */
	public Tool[] getTools() {
		return tools;
	}

	/**
	 * @param tools the tools to set
	 */
	public void setTools(Tool[] tools) {
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
}
