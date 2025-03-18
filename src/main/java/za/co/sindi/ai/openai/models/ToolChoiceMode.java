/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 */
public enum ToolChoiceMode {
	NONE("none")
	,AUTO("auto")
	,REQUIRED("required")
	;
	private final String mode;

	/**
	 * @param mode
	 */
	private ToolChoiceMode(String mode) {
		this.mode = mode;
	}
	
	public static ToolChoiceMode of(final String value) {
		for (ToolChoiceMode mode : values()) {
			if (mode.mode.equals(value)) return mode;
		}
		
		throw new IllegalArgumentException("Invalid tool choice mode '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return mode;
	}
}
