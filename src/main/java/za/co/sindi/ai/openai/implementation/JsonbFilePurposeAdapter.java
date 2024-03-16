/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.FilePurpose;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbFilePurposeAdapter implements JsonbAdapter<FilePurpose, String> {

	@Override
	public String adaptToJson(FilePurpose format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public FilePurpose adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return FilePurpose.of(value);
	}
}
