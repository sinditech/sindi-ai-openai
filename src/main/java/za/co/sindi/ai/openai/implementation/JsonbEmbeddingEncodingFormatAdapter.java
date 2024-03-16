/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.EmbeddingEncodingFormat;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbEmbeddingEncodingFormatAdapter implements JsonbAdapter<EmbeddingEncodingFormat, String> {

	@Override
	public String adaptToJson(EmbeddingEncodingFormat format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public EmbeddingEncodingFormat adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return EmbeddingEncodingFormat.of(value);
	}
}
