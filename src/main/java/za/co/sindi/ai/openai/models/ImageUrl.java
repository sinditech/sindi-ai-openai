/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public class ImageUrl implements Serializable {

	@JsonbProperty
	private String url;
	
	@JsonbProperty
	private ImageDetail detail;

	/**
	 * @param url
	 */
	public ImageUrl(String url) {
		super();
		this.url = Objects.requireNonNull(url, "A url is required.");
	}

	/**
	 * @return the detail
	 */
	public ImageDetail getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(ImageDetail detail) {
		this.detail = detail;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
}
