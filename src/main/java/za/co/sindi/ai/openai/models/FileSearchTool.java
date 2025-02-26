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
public class FileSearchTool extends Tool {
	
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
