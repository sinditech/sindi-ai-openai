/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class Embedding implements Serializable {

	@JsonbProperty
	private int index;
	
	@JsonbProperty
	private float[] embedding;
	
	@JsonbProperty
	private String object;

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * @return the embedding
	 */
	public float[] getEmbedding() {
		return embedding;
	}

	/**
	 * @param embedding the embedding to set
	 */
	public void setEmbedding(float[] embedding) {
		this.embedding = embedding;
	}

	/**
	 * @return the object
	 */
	public String getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(String object) {
		this.object = object;
	}
}
