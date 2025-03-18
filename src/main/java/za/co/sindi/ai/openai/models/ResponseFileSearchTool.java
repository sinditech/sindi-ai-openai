/**
 * 
 */
package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">OpenAI API reference documentation.</a>
 */
public class ResponseFileSearchTool extends ResponseTool {
	
	@JsonbProperty("vector_store_ids")
	private String[] vectorStoreIds;
	
	@JsonbProperty
	private Filter filters;
	
	@JsonbProperty("max_num_results")
	private Integer maximumNumberOfResults;

	@JsonbProperty("ranking_options")
	private RankingOptions rankingOptions;

	/**
	 * @return the vectorStoreIds
	 */
	public String[] getVectorStoreIds() {
		return vectorStoreIds;
	}

	/**
	 * @param vectorStoreIds the vectorStoreIds to set
	 */
	public void setVectorStoreIds(String[] vectorStoreIds) {
		this.vectorStoreIds = vectorStoreIds;
	}

	/**
	 * @return the filters
	 */
	public Filter getFilters() {
		return filters;
	}

	/**
	 * @param filters the filters to set
	 */
	public void setFilters(Filter filters) {
		this.filters = filters;
	}

	/**
	 * @return the maximumNumberOfResults
	 */
	public Integer getMaximumNumberOfResults() {
		return maximumNumberOfResults;
	}

	/**
	 * @param maximumNumberOfResults the maximumNumberOfResults to set
	 */
	public void setMaximumNumberOfResults(Integer maximumNumberOfResults) {
		this.maximumNumberOfResults = maximumNumberOfResults;
	}

	/**
	 * @return the rankingOptions
	 */
	public RankingOptions getRankingOptions() {
		return rankingOptions;
	}

	/**
	 * @param rankingOptions the rankingOptions to set
	 */
	public void setRankingOptions(RankingOptions rankingOptions) {
		this.rankingOptions = rankingOptions;
	}
}
