/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class LogProbability implements Serializable {

	@JsonbProperty
	private TokenLogProbability[] content;
	
	@JsonbProperty
	private TokenLogProbability[] refusal;
	
	/**
	 * 
	 */
	public LogProbability() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param content
	 */
	public LogProbability(TokenLogProbability[] content) {
		super();
		this.content = content;
	}

	/**
	 * @return the content
	 */
	public TokenLogProbability[] getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(TokenLogProbability[] content) {
		this.content = content;
	}

	/**
	 * @return the refusal
	 */
	public TokenLogProbability[] getRefusal() {
		return refusal;
	}

	/**
	 * @param refusal the refusal to set
	 */
	public void setRefusal(TokenLogProbability[] refusal) {
		this.refusal = refusal;
	}
}
