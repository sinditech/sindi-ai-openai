package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class FileSearchToolCall extends Item {

	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private String[] queries;
	
	@JsonbProperty
	private FileSearchToolCallResult[] results;

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
	 * @return the queries
	 */
	public String[] getQueries() {
		return queries;
	}

	/**
	 * @param queries the queries to set
	 */
	public void setQueries(String[] queries) {
		this.queries = queries;
	}

	/**
	 * @return the results
	 */
	public FileSearchToolCallResult[] getResults() {
		return results;
	}

	/**
	 * @param results the results to set
	 */
	public void setResults(FileSearchToolCallResult[] results) {
		this.results = results;
	}
}
