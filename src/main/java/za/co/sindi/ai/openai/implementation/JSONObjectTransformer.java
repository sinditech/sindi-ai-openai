/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import java.io.InputStream;

import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbConfig;
import za.co.sindi.ai.openai.ObjectTransformer;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JSONObjectTransformer implements ObjectTransformer {
	
	private JsonbConfig newJsonbConfig() {
		JsonbConfig config = new JsonbConfig();
		config.withAdapters(new JsonbAudioTranscriptResponseFormatAdapter(), 
							new JsonbEmbeddingEncodingFormatAdapter(), 
							new JsonbChatResponseFormatAdapter(),
							new JsonbImageResponseFormatAdapter(),
							new JsonbAudioSpeechResponseFormatAdapter(),
							new JsonbTTSModelFormatAdapter(), 
							new JsonbImageSizeAdapter(),
							new JsonbImageStyleAdapter(),
							new JsonbFineTuningJobStatusAdapter(),
							new JsonbFilePurposeAdapter(),
							new JsonbModerationModelNameAdapter(),
							new JsonbDALLEModelFormatAdapter(),
							new JsonbGPTModelFormatAdapter(),
							new JsonbImageDetailAdapter(),
							new JsonbServiceTierAdapter());
		return config;
	}

	@Override
	public <E> String transform(E object) {
		// TODO Auto-generated method stub
		return JsonbBuilder.create(newJsonbConfig()).toJson(object);
	}

	@Override
	public <E> E transform(String data, Class<E> type) {
		// TODO Auto-generated method stub
		return JsonbBuilder.create(newJsonbConfig()).fromJson(data, type);
	}

	@Override
	public <E> E transform(InputStream stream, Class<E> type) {
		// TODO Auto-generated method stub
		return JsonbBuilder.create(newJsonbConfig()).fromJson(stream, type);
	}
}
