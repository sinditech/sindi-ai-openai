package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class Reasoning extends Item {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private Summary summary;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * @return the summary
	 */
	public Summary getSummary() {
		return summary;
	}

	/**
	 * @param summary the summary to set
	 */
	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	@JsonbTypeInfo(
		key = "type",
		value = {
		    @JsonbSubtype(alias="summary_text", type=TextSummary.class),
		}
	)
	public static abstract class Summary implements Serializable {
		
	}
	
	public static class TextSummary extends Summary {
		
		@JsonbProperty
		private String text;

		/**
		 * @return the text
		 */
		public String getText() {
			return text;
		}

		/**
		 * @param text the text to set
		 */
		public void setText(String text) {
			this.text = text;
		}
	}
}
