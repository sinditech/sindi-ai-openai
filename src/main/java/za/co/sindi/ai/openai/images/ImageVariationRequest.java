/**
 * 
 */
package za.co.sindi.ai.openai.images;

import java.nio.file.Path;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.ai.openai.models.ImageModel;
import za.co.sindi.ai.openai.models.ImageResponseFormat;
import za.co.sindi.ai.openai.models.ImageSize;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class ImageVariationRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/images/variations";
	
	private Path image;
	private ImageModel model;
	private Integer n;
	private ImageResponseFormat responseFormat;
	private ImageSize size;
	private String user;

	/**
	 * @param image
	 */
	public ImageVariationRequest(final Path image) {
		this(URI, image);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param uri
	 * @param image
	 */
	public ImageVariationRequest(final String uri, final Path image) {
		super("POST", uri, "multipart/form-data");
		// TODO Auto-generated constructor stub
		this.image = image;
	}
	
	/**
	 * @return the model
	 */
	public ImageModel getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(ImageModel model) {
		this.model = model;
	}

	/**
	 * @return the n
	 */
	public Integer getN() {
		return n;
	}

	/**
	 * @param n the n to set
	 */
	public void setN(Integer n) {
		this.n = n;
	}

	/**
	 * @return the responseFormat
	 */
	public ImageResponseFormat getResponseFormat() {
		return responseFormat;
	}

	/**
	 * @param responseFormat the responseFormat to set
	 */
	public void setResponseFormat(ImageResponseFormat responseFormat) {
		this.responseFormat = responseFormat;
	}

	/**
	 * @return the size
	 */
	public ImageSize getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(ImageSize size) {
		this.size = size;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the image
	 */
	public Path getImage() {
		return image;
	}
}
