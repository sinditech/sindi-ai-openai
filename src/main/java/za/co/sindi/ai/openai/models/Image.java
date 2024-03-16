/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 25 January 2024
 */
public class Image implements Serializable {

	@JsonbProperty("b64_json")
	private String b64Json;
	
	@JsonbProperty
	private String url;
	
	@JsonbProperty("revised_prompt")
	private String revisedPrompt;

	/**
	 * @return the b64Json
	 */
	public String getB64Json() {
		return b64Json;
	}

	/**
	 * @param b64Json the b64Json to set
	 */
	public void setB64Json(String b64Json) {
		this.b64Json = b64Json;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the revisedPrompt
	 */
	public String getRevisedPrompt() {
		return revisedPrompt;
	}

	/**
	 * @param revisedPrompt the revisedPrompt to set
	 */
	public void setRevisedPrompt(String revisedPrompt) {
		this.revisedPrompt = revisedPrompt;
	}
}
