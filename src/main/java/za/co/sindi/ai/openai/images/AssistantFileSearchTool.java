/**
 * 
 */
package za.co.sindi.ai.openai.images;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.openai.models.FileSearch;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class AssistantFileSearchTool extends AssistantTool {
	
	@JsonbProperty("file_search")
	private FileSearch fileSearch;

	/**
	 * @return the fileSearch
	 */
	public FileSearch getFileSearch() {
		return fileSearch;
	}

	/**
	 * @param fileSearch the fileSearch to set
	 */
	public void setFileSearch(FileSearch fileSearch) {
		this.fileSearch = fileSearch;
	}
}
