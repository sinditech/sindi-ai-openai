/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * 
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/object">OpenAI API reference documentation.</a>
 */
public class ChatConversation implements Serializable {

	@JsonbProperty
	private List<ChatRequestMessage<?>> messages;

	@JsonbProperty
	private String model;
	
	@JsonbProperty
	private Boolean store;
	
	@JsonbProperty
	private Map<String, Object> metadata;
	
	@JsonbProperty("frequency_penalty")
	private Double frequencyPenalty;
	
	@JsonbProperty("logit_bias")
	private Map<String, Double> logitBias;
	
	@JsonbProperty("logprobs")
	private Boolean logProbabilities;
	
	@JsonbProperty("top_logprobs")
	private Integer topLogProbabilites;
	
	@Deprecated
	@JsonbProperty("max_tokens")
	private Integer maxTokens;
	
	@JsonbProperty("max_completion_tokens")
	private Integer maxCompletionTokens;
	
	@JsonbProperty
	private Integer n;
	
	@JsonbProperty
	private String[] modalities;
	
	@JsonbProperty
	private StaticContent<?> prediction;
	
	@JsonbProperty
	private Audio audio;
	
	@JsonbProperty("presence_penalty")
	private Double presencePenalty;
	
	@JsonbProperty("response_format")
	private ChatCompletionResponseFormat responseFormat;
	
	@JsonbProperty
	private Integer seed;
	
	@JsonbProperty("service_tier")
	private ServiceTier serviceTier;
	
	@JsonbProperty
	private String[] stop;
	
	@JsonbProperty
	private Boolean stream;
	
	@JsonbProperty("stream_options")
	private StreamOptions streamOptions;
	
	@JsonbProperty
	private Double temperature;
	
	@JsonbProperty("top_p")
	private Integer topP;
	
	@JsonbProperty
	private Tool[] tools;
	
	@JsonbProperty("tool_choice")
	private Object toolChoice;
	
	@JsonbProperty("parallel_tool_calls")
	private Boolean parallelToolCalls;
	
	@JsonbProperty
	private String user;

	/**
	 * @param messages
	 * @param model
	 */
	public ChatConversation(List<ChatRequestMessage<?>> messages, String model) {
		super();
		this.messages = Objects.requireNonNull(messages);
		this.model = Objects.requireNonNull(model);
	}

	/**
	 * @return the store
	 */
	public Boolean getStore() {
		return store;
	}

	/**
	 * @param store the store to set
	 */
	public void setStore(Boolean store) {
		this.store = store;
	}

	/**
	 * @return the metadata
	 */
	public Map<String, Object> getMetadata() {
		return metadata;
	}

	/**
	 * @param metadata the metadata to set
	 */
	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
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
	@Deprecated
	public Integer getMaxTokens() {
		return maxTokens;
	}

	/**
	 * @param maxTokens the maxTokens to set
	 */
	@Deprecated
	public void setMaxTokens(Integer maxTokens) {
		this.maxTokens = maxTokens;
	}

	/**
	 * @return the maxCompletionTokens
	 */
	public Integer getMaxCompletionTokens() {
		return maxCompletionTokens;
	}

	/**
	 * @param maxCompletionTokens the maxCompletionTokens to set
	 */
	public void setMaxCompletionTokens(Integer maxCompletionTokens) {
		this.maxCompletionTokens = maxCompletionTokens;
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
	 * @return the modalities
	 */
	public String[] getModalities() {
		return modalities;
	}

	/**
	 * @param modalities the modalities to set
	 */
	public void setModalities(String[] modalities) {
		this.modalities = modalities;
	}

	/**
	 * @return the prediction
	 */
	public StaticContent<?> getPrediction() {
		return prediction;
	}

	/**
	 * @param prediction the prediction to set
	 */
	public void setPrediction(StaticContent<?> prediction) {
		this.prediction = prediction;
	}

	/**
	 * @return the audio
	 */
	public Audio getAudio() {
		return audio;
	}

	/**
	 * @param audio the audio to set
	 */
	public void setAudio(Audio audio) {
		this.audio = audio;
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
	public ChatCompletionResponseFormat getResponseFormat() {
		return responseFormat;
	}

	/**
	 * @param responseFormat the responseFormat to set
	 */
	public void setResponseFormat(ChatCompletionResponseFormat responseFormat) {
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
	 * @return the serviceTier
	 */
	public ServiceTier getServiceTier() {
		return serviceTier;
	}

	/**
	 * @param serviceTier the serviceTier to set
	 */
	public void setServiceTier(ServiceTier serviceTier) {
		this.serviceTier = serviceTier;
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
	 * @return the streamOptions
	 */
	public StreamOptions getStreamOptions() {
		return streamOptions;
	}

	/**
	 * @param streamOptions the streamOptions to set
	 */
	public void setStreamOptions(StreamOptions streamOptions) {
		this.streamOptions = streamOptions;
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
	 * @return the tools
	 */
	public Tool[] getTools() {
		return tools;
	}

	/**
	 * @param tools the tools to set
	 */
	public void setTools(Tool[] tools) {
		this.tools = tools;
	}

	/**
	 * @return the toolChoice
	 */
	public Object getToolChoice() {
		return toolChoice;
	}

	/**
	 * @param toolChoice the toolChoice to set
	 */
	public void setToolChoice(String toolChoice) {
		this.toolChoice = toolChoice;
	}
	
	/**
	 * @param toolChoice the toolChoice to set
	 */
	public void setToolChoice(ToolChoice toolChoice) {
		this.toolChoice = toolChoice;
	}

	/**
	 * @return the parallelToolCalls
	 */
	public Boolean getParallelToolCalls() {
		return parallelToolCalls;
	}

	/**
	 * @param parallelToolCalls the parallelToolCalls to set
	 */
	public void setParallelToolCalls(Boolean parallelToolCalls) {
		this.parallelToolCalls = parallelToolCalls;
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
	 * @return the messages
	 */
	public List<ChatRequestMessage<?>> getMessages() {
		return messages;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
}
