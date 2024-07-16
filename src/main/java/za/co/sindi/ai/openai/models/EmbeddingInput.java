/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/audio">OpenAI API reference documentation.</a>
 */
public abstract class EmbeddingInput<T extends Serializable> implements Serializable {
	
	@JsonbProperty
	private Embeddings model;
	
	@JsonbProperty("encoding_format")
	private EmbeddingEncodingFormat encodingFormat;
	
	@JsonbProperty
	private Integer dimensions;
	
	@JsonbProperty
	private String user;

	/**
	 * 
	 */
	protected EmbeddingInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param model
	 */
	protected EmbeddingInput(Embeddings model) {
		super();
		this.model = Objects.requireNonNull(model, "'model' is required.");
	}

	/**
	 * @return the input
	 */
	public abstract T getInput();

	/**
	 * @param input the input to set
	 */
	public abstract void setInput(T input);

	/**
	 * @return the model
	 */
	public Embeddings getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(Embeddings model) {
		this.model = model;
	}

	/**
	 * @return the encodingFormat
	 */
	public EmbeddingEncodingFormat getEncodingFormat() {
		return encodingFormat;
	}

	/**
	 * @param encodingFormat the encodingFormat to set
	 */
	public void setEncodingFormat(EmbeddingEncodingFormat encodingFormat) {
		this.encodingFormat = encodingFormat;
	}

	/**
	 * @return the dimensions
	 */
	public Integer getDimensions() {
		return dimensions;
	}

	/**
	 * @param dimensions the dimensions to set
	 */
	public void setDimensions(Integer dimensions) {
		this.dimensions = dimensions;
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
