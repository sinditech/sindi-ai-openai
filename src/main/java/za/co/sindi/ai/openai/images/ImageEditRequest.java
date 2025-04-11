/**
 * 
 */
package za.co.sindi.ai.openai.images;

import java.nio.file.Path;
import java.util.Objects;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.ai.openai.models.ImageModel;
import za.co.sindi.ai.openai.models.ImageResponseFormat;
import za.co.sindi.ai.openai.models.ImageSize;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class ImageEditRequest extends OpenAIRequest {

	private static final String URI = "/images/edits";
	
	private Path image;
	private String prompt;
	private Path maskImage;
	private ImageModel model;
	private Integer n;
	private ImageResponseFormat responseFormat;
	private ImageSize size;
	private String user;

	/**
	 * @param image
	 * @param prompt
	 */
	public ImageEditRequest(final Path image, final String prompt) {
		this(URI, image, prompt);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param image
	 * @param prompt
	 */
	public ImageEditRequest(final String uri, final Path image, final String prompt) {
		super("POST", uri, "multipart/form-data");
		// TODO Auto-generated constructor stub
		this.image = Objects.requireNonNull(image);
		this.prompt = Objects.requireNonNull(prompt);
	}

	/**
	 * @return the maskImage
	 */
	public Path getMaskImage() {
		return maskImage;
	}

	/**
	 * @param maskImage the maskImage to set
	 */
	public void setMaskImage(Path maskImage) {
		this.maskImage = maskImage;
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

	/**
	 * @return the prompt
	 */
	public String getPrompt() {
		return prompt;
	}
}
