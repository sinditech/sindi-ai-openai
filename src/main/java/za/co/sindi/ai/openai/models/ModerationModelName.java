/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 23 January 2024
 * @see <a href="https://platform.openai.com/docs/models#moderation">Moderation Model</a>
 */
public enum ModerationModelName {
	OMNI_MODERATION_LATEST("omni-moderation-latest")
	,OMNI_MODERATION_2024_09_26("omni-moderation-2024-09-26")
	,@Deprecated TEXT_MODERATION_STABLE("text-moderation-stable")
	,@Deprecated TEXT_MODERATION_LATEST("text-moderation-latest")
	,@Deprecated TEXT_MODERATION_007("text-moderation-007")
	;
	private final String model;

	/**
	 * @param model
	 */
	private ModerationModelName(String model) {
		this.model = model;
	}
	
	public static ModerationModelName getLatest() {
		return OMNI_MODERATION_LATEST;
	}
	
	public static ModerationModelName of(final String value) {
		for (ModerationModelName model : values()) {
			if (model.model.equals(value)) return model;
		}
		
		throw new IllegalArgumentException("Invalid moderation model '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return model;
	}
}
