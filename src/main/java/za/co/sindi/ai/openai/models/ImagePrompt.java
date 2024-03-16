/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 25 January 2024
 */
public class ImagePrompt implements Serializable {

	@JsonbProperty
	private String prompt;
	
	@JsonbProperty
	private ImageModel model;
	
	@JsonbProperty
	private Integer n;
	
	@JsonbProperty
	private ImageQuality quality;
	
	@JsonbProperty("response_format")
	private ImageResponseFormat responseFormat;
	
	@JsonbProperty
	private ImageSize size;
	
	@JsonbProperty
	private String user;

	/**
	 * 
	 */
	public ImagePrompt() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param prompt
	 */
	public ImagePrompt(String prompt) {
		super();
		this.prompt = Objects.requireNonNull(prompt);
	}

	/**
	 * @return the prompt
	 */
	public String getPrompt() {
		return prompt;
	}

	/**
	 * @param prompt the prompt to set
	 */
	public void setPrompt(String prompt) {
		this.prompt = prompt;
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
	 * @return the quality
	 */
	public ImageQuality getQuality() {
		return quality;
	}

	/**
	 * @param quality the quality to set
	 */
	public void setQuality(ImageQuality quality) {
		this.quality = quality;
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
}
