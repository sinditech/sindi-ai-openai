/**
 * 
 */
package za.co.sindi.ai.openai.implementation;

import jakarta.json.bind.adapter.JsonbAdapter;
import za.co.sindi.ai.openai.models.ServiceTier;

/**
 * @author Buhake Sindi
 * @since 18 September 2024
 */
public class JsonbServiceTierAdapter implements JsonbAdapter<ServiceTier, String> {

	@Override
	public String adaptToJson(ServiceTier serviceTier) throws Exception {
		// TODO Auto-generated method stub
		if (serviceTier == null) return null;
		return serviceTier.toString();
	}

	@Override
	public ServiceTier adaptFromJson(String value) throws Exception {
		// TODO Auto-generated method stub
		if (value == null) return null;
		return ServiceTier.of(value);
	}
}
