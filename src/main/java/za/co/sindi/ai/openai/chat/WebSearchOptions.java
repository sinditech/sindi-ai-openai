package za.co.sindi.ai.openai.chat;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.openai.models.SearchContextSize;
import za.co.sindi.ai.openai.models.UserLocation;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class WebSearchOptions implements Serializable {

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
