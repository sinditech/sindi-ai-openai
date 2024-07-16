/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * 
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/completions">OpenAI API reference documentation.</a>
 */
public abstract class CompletionInput<T extends Serializable> implements Serializable {

	@JsonbProperty
	private String model;
	
	@JsonbProperty("best_of")
	private Integer bestOf;
	
	@JsonbProperty
	private Boolean echo;
	
	@JsonbProperty("frequency_penalty")
	private Double frequencyPenalty;
	
	@JsonbProperty("logit_bias")
	private Map<String, Double> logitBias;
	
	@JsonbProperty("logprobs")
	private Boolean logProbabilities;
	
	@JsonbProperty("top_logprobs")
	private Integer topLogProbabilites;
	
	@JsonbProperty("max_tokens")
	private Integer maxTokens;
	
	@JsonbProperty
	private Integer n;
	
	@JsonbProperty("presence_penalty")
	private Double presencePenalty;
	
	@JsonbProperty("response_format")
	private ChatResponseFormat responseFormat;
	
	@JsonbProperty
	private Integer seed;
	
	@JsonbProperty
	private String[] stop;
	
	@JsonbProperty
	private Boolean stream;
	
	@JsonbProperty
	private String suffix;
	
	@JsonbProperty
	private Double temperature;
	
	@JsonbProperty("top_p")
	private Integer topP;
	
	@JsonbProperty
	private String user;

	/**
	 * @param model
	 */
	protected CompletionInput(String model) {
		super();
		this.model = Objects.requireNonNull(model, "A model is required.");
	}

	/**
	 * @return the frequencyPenalty
	 */
	public Double getFrequencyPenalty() {
		return frequencyPenalty;
	}

	/**
	 * @param frequencyPenalty the frequencyPenalty to set
	 */
	public void setFrequencyPenalty(Double frequencyPenalty) {
		this.frequencyPenalty = frequencyPenalty;
	}

	/**
	 * @return the logitBias
	 */
	public Map<String, Double> getLogitBias() {
		return logitBias;
	}

	/**
	 * @param logitBias the logitBias to set
	 */
	public void setLogitBias(Map<String, Double> logitBias) {
		this.logitBias = logitBias;
	}

	/**
	 * @return the logProbabilities
	 */
	public Boolean getLogProbabilities() {
		return logProbabilities;
	}

	/**
	 * @param logProbabilities the logProbabilities to set
	 */
	public void setLogProbabilities(Boolean logProbabilities) {
		this.logProbabilities = logProbabilities;
	}

	/**
	 * @return the topLogProbabilites
	 */
	public Integer getTopLogProbabilites() {
		return topLogProbabilites;
	}

	/**
	 * @param topLogProbabilites the topLogProbabilites to set
	 */
	public void setTopLogProbabilites(Integer topLogProbabilites) {
		this.topLogProbabilites = topLogProbabilites;
	}

	/**
	 * @return the maxTokens
	 */
	public Integer getMaxTokens() {
		return maxTokens;
	}

	/**
	 * @param maxTokens the maxTokens to set
	 */
	public void setMaxTokens(Integer maxTokens) {
		this.maxTokens = maxTokens;
	}

	/**
	 * @return the n
	 */
	public Integer getN() {
		return n;
	}

	/**
	 * @param n the n to set
	 */
	public void setN(Integer n) {
		this.n = n;
	}

	/**
	 * @return the presencePenalty
	 */
	public Double getPresencePenalty() {
		return presencePenalty;
	}

	/**
	 * @param presencePenalty the presencePenalty to set
	 */
	public void setPresencePenalty(Double presencePenalty) {
		this.presencePenalty = presencePenalty;
	}

	/**
	 * @return the responseFormat
	 */
	public ChatResponseFormat getResponseFormat() {
		return responseFormat;
	}

	/**
	 * @param responseFormat the responseFormat to set
	 */
	public void setResponseFormat(ChatResponseFormat responseFormat) {
		this.responseFormat = responseFormat;
	}

	/**
	 * @return the seed
	 */
	public Integer getSeed() {
		return seed;
	}

	/**
	 * @param seed the seed to set
	 */
	public void setSeed(Integer seed) {
		this.seed = seed;
	}

	/**
	 * @return the stop
	 */
	public String[] getStop() {
		return stop;
	}

	/**
	 * @param stop the stop to set
	 */
	public void setStop(String[] stop) {
		this.stop = stop;
	}

	/**
	 * @return the stream
	 */
	public Boolean getStream() {
		return stream;
	}

	/**
	 * @param stream the stream to set
	 */
	public void setStream(Boolean stream) {
		this.stream = stream;
	}

	/**
	 * @return the temperature
	 */
	public Double getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the topP
	 */
	public Integer getTopP() {
		return topP;
	}

	/**
	 * @param topP the topP to set
	 */
	public void setTopP(Integer topP) {
		this.topP = topP;
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

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the bestOf
	 */
	public Integer getBestOf() {
		return bestOf;
	}

	/**
	 * @param bestOf the bestOf to set
	 */
	public void setBestOf(Integer bestOf) {
		this.bestOf = bestOf;
	}

	/**
	 * @return the echo
	 */
	public Boolean getEcho() {
		return echo;
	}

	/**
	 * @param echo the echo to set
	 */
	public void setEcho(Boolean echo) {
		this.echo = echo;
	}

	/**
	 * @return the suffix
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * @param suffix the suffix to set
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/**
	 * @return the prompt
	 */
	public abstract T getPrompt();
}
