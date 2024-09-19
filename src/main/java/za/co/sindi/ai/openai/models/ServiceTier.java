/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 18 September 2024
 * @see <a href="https://platform.openai.com/docs/api-reference/chat/create">Create chat completion object</a>
 */
public enum ServiceTier {
	AUTO("auto")
	,DEFAULT("default")
	;
	private final String tier;

	/**
	 * @param tier
	 */
	private ServiceTier(String tier) {
		this.tier = tier;
	}
	
	public static ServiceTier of(final String value) {
		for (ServiceTier tier : values()) {
			if (tier.tier.equals(value)) return tier;
		}
		
		throw new IllegalArgumentException("Invalid service_tier '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tier;
	}
}
