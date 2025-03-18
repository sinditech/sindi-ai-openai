/**
 * 
 */
package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">OpenAI API reference documentation.</a>
 */
public class ResponseWebSearchPreviewTool extends ResponseTool {
	
	@JsonbProperty("search_context_size")
	private SearchContextSize searchContextSize;
	
	@JsonbProperty("user_location")
	private UserLocation userLocation;

	/**
	 * @return the searchContextSize
	 */
	public SearchContextSize getSearchContextSize() {
		return searchContextSize;
	}

	/**
	 * @param searchContextSize the searchContextSize to set
	 */
	public void setSearchContextSize(SearchContextSize searchContextSize) {
		this.searchContextSize = searchContextSize;
	}

	/**
	 * @return the userLocation
	 */
	public UserLocation getUserLocation() {
		return userLocation;
	}

	/**
	 * @param userLocation the userLocation to set
	 */
	public void setUserLocation(UserLocation userLocation) {
		this.userLocation = userLocation;
	}
}
