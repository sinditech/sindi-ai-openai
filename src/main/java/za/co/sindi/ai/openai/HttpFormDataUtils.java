/**
 * 
 */
package za.co.sindi.ai.openai;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import za.co.sindi.ai.openai.audio.AudioTranscriptionRequest;
import za.co.sindi.ai.openai.audio.AudioTranslationRequest;
import za.co.sindi.ai.openai.files.UploadFileRequest;
import za.co.sindi.ai.openai.images.ImageEditRequest;
import za.co.sindi.ai.openai.images.ImageVariationRequest;
import za.co.sindi.ai.openai.models.AudioTranscriptResponseFormat;
import za.co.sindi.ai.openai.models.ImageResponseFormat;
import za.co.sindi.commons.utils.Strings;

/**
 * @author Buhake Sindi
 * @since 25 January 2024
 */
public final class HttpFormDataUtils {

	private HttpFormDataUtils() {
		throw new AssertionError("Private Constructor.");
	}
	
	public static final String createMultipartBoundaryID() {
		return new BigInteger(256, ThreadLocalRandom.current()).toString();
	}
	
	public static Map<String, Object> toMap(final AudioTranscriptionRequest request) {
		Map<String, Object> formData = new LinkedHashMap<>();
		formData.put("file", request.getFile());
		formData.put("model", request.getModel());
		
		if (!Strings.isNullOrEmpty(request.getLanguage())) {
			formData.put("language", request.getLanguage());
		}
		
		if (!Strings.isNullOrEmpty(request.getPrompt())) {
			formData.put("prompt", request.getPrompt());
		}
		
		formData.put("response_format", Optional.ofNullable(request.getResponseFormat()).orElse(AudioTranscriptResponseFormat.TEXT).toString());
		if (request.getTemperature() != null) {
			formData.put("temperature", request.getTemperature());
		}
		
		return formData;
	}
	
	public static Map<String, Object> toMap(final AudioTranslationRequest request) {
		Map<String, Object> formData = new LinkedHashMap<>();
		formData.put("file", request.getFile());
		formData.put("model", request.getModel());
		
		if (!Strings.isNullOrEmpty(request.getPrompt())) {
			formData.put("prompt", request.getPrompt());
		}
		
		formData.put("response_format", Optional.ofNullable(request.getResponseFormat()).orElse(AudioTranscriptResponseFormat.TEXT).toString());
		if (request.getTemperature() != null) {
			formData.put("temperature", request.getTemperature());
		}
		
		return formData;
	}
	
	public static Map<String, Object> toMap(final UploadFileRequest request) {
		Map<String, Object> formData = new LinkedHashMap<>();
		formData.put("file", request.getFile());
		formData.put("purpose", request.getPurpose().toString());
		
		return formData;
	}
	
	public static Map<String, Object> toMap(final ImageEditRequest request) {
		Map<String, Object> formData = new LinkedHashMap<>();
		formData.put("image", request.getImage());
		formData.put("prompt", request.getPrompt());
		
		if (request.getMaskImage() != null) {
			formData.put("mask", request.getImage());
		}
		
		if (request.getModel() != null) {
			formData.put("model", request.getModel().toString());
		}
		
		if (request.getN() != null) {
			formData.put("n", request.getN());
		}
		
		if (request.getSize() != null) {
			formData.put("size", request.getSize());
		}
		
		formData.put("response_format", Optional.ofNullable(request.getResponseFormat()).orElse(ImageResponseFormat.URL).toString());
		
		if (!Strings.isNullOrEmpty(request.getUser())) {
			formData.put("user", request.getUser());
		}
		
		return formData;
	}
	
	public static Map<String, Object> toMap(final ImageVariationRequest request) {
		Map<String, Object> formData = new LinkedHashMap<>();
		formData.put("image", request.getImage());
		
		if (request.getModel() != null) {
			formData.put("model", request.getModel().toString());
		}
		
		if (request.getN() != null) {
			formData.put("n", request.getN());
		}
		
		if (request.getSize() != null) {
			formData.put("size", request.getSize());
		}
		
		formData.put("response_format", Optional.ofNullable(request.getResponseFormat()).orElse(ImageResponseFormat.URL).toString());
		
		if (!Strings.isNullOrEmpty(request.getUser())) {
			formData.put("user", request.getUser());
		}
		
		return formData;
	}
}
