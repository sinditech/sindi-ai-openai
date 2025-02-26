package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 26 February 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/assistants/object">Assistants object</a>
 */
public class RankingOption implements Serializable {

	@JsonbProperty
	private String ranker;
	
	@JsonbProperty("score_threshold")
	private Float scoreThreshold;

	/**
	 * @return the ranker
	 */
	public String getRanker() {
		return ranker;
	}

	/**
	 * @param ranker the ranker to set
	 */
	public void setRanker(String ranker) {
		this.ranker = ranker;
	}

	/**
	 * @return the scoreThreshold
	 */
	public Float getScoreThreshold() {
		return scoreThreshold;
	}

	/**
	 * @param scoreThreshold the scoreThreshold to set
	 */
	public void setScoreThreshold(Float scoreThreshold) {
		this.scoreThreshold = scoreThreshold;
	}
}
