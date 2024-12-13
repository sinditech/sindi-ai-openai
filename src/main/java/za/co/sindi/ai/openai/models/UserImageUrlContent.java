/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class UserImageUrlContent extends UserContent {

	@JsonbProperty("image_url")
	private ImageUrl imageUrl;

	/**
	 * @param imageUrl
	 */
	public UserImageUrlContent(ImageUrl imageUrl) {
		super();
		this.imageUrl = Objects.requireNonNull(imageUrl, "An Image Url object is required.");
	}

	/**
	 * @return the imageUrl
	 */
	public ImageUrl getImageUrl() {
		return imageUrl;
	}
}
