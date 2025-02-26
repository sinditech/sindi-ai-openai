/**
 * 
 */
package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class CodeInterpreterToolResource extends ToolResource {
	
	@JsonbProperty("file_ids")
	private String[] fileIds;

	/**
	 * @return the fileIds
	 */
	public String[] getFileIds() {
		return fileIds;
	}

	/**
	 * @param fileIds the fileIds to set
	 */
	public void setFileIds(String[] fileIds) {
		this.fileIds = fileIds;
	}
}
