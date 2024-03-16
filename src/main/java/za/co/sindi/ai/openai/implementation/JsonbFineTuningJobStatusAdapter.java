/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.FineTuningJobStatus;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class JsonbFineTuningJobStatusAdapter implements JsonbAdapter<FineTuningJobStatus, String> {

	@Override
	public String adaptToJson(FineTuningJobStatus format) throws Exception {
		// TODO Auto-generated method stub
		if (format == null) return null;
		return format.toString();
	}

	@Override
	public FineTuningJobStatus adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return FineTuningJobStatus.of(value);
	}
}
