/**
 * 
 */
package za.co.sindi.ai.openai.audio;

import java.nio.file.Path;
import java.util.Objects;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.ai.openai.models.AudioTranscriptResponseFormat;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class AudioTranscriptionRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/audio/transcriptions";
	
	private Path file;
	
	private String model;
	
	private String language;
	
	private String prompt;
	
	private AudioTranscriptResponseFormat responseFormat;
	
	private Double temperature;
	
	/**
	 * 
	 * @param file
	 * @param model
	 */
	public AudioTranscriptionRequest(final Path file, final String model) {
		this(URI, file, model);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uri
	 * @param file
	 * @param model
	 */
	public AudioTranscriptionRequest(String uri, Path file, String model) {
		super("POST", uri, "multipart/form-data");
		this.file = Objects.requireNonNull(file, "A file is required.");
		this.model = Objects.requireNonNull(model, "A model is required.");
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the prompt
	 */
	public String getPrompt() {
		return prompt;
	}

	/**
	 * @param prompt the prompt to set
	 */
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	/**
	 * @return the responseFormat
	 */
	public AudioTranscriptResponseFormat getResponseFormat() {
		return responseFormat;
	}

	/**
	 * @param responseFormat the responseFormat to set
	 */
	public void setResponseFormat(AudioTranscriptResponseFormat responseFormat) {
		this.responseFormat = responseFormat;
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
	 * @return the file
	 */
	public Path getFile() {
		return file;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
}
