package za.co.sindi.ai.openai.vector_store;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;
import za.co.sindi.ai.openai.models.Filter;
import za.co.sindi.ai.openai.models.RankingOptions;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/vector-stores/create">Create Vector Store reference documentation.</a>
 */
public class SearchVectorStoreInput implements Serializable {
	
	@JsonbProperty
	private String query;
	
	@JsonbProperty
	private Filter filters;

	@JsonbProperty("max_num_results")
	private Integer maximumNumberOfResults;
	
	@JsonbProperty("ranking_options")
	private RankingOptions rankingOptions;
	
	@JsonbProperty("rewrite_query")
	private Boolean rewriteQuery;

	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * @param query the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
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

	/**
	 * @return the rewriteQuery
	 */
	public Boolean getRewriteQuery() {
		return rewriteQuery;
	}

	/**
	 * @param rewriteQuery the rewriteQuery to set
	 */
	public void setRewriteQuery(Boolean rewriteQuery) {
		this.rewriteQuery = rewriteQuery;
	}
}
