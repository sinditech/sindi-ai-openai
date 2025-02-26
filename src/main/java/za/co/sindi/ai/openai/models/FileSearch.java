package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 26 February 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/assistants/object">Assistants object</a>
 */
public class FileSearch implements Serializable {

	@JsonbProperty("max_num_results")
	private Integer maxNumberOfResults;
	
	@JsonbProperty("ranking_options")
	private RankingOption rankingOption;

	/**
	 * @return the maxNumberOfResults
	 */
	public Integer getMaxNumberOfResults() {
		return maxNumberOfResults;
	}

	/**
	 * @param maxNumberOfResults the maxNumberOfResults to set
	 */
	public void setMaxNumberOfResults(Integer maxNumberOfResults) {
		this.maxNumberOfResults = maxNumberOfResults;
	}

	/**
	 * @return the rankingOption
	 */
	public RankingOption getRankingOption() {
		return rankingOption;
	}

	/**
	 * @param rankingOption the rankingOption to set
	 */
	public void setRankingOption(RankingOption rankingOption) {
		this.rankingOption = rankingOption;
	}
}
