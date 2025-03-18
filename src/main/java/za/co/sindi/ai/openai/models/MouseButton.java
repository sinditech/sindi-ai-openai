/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 18 March 2024
 */
public enum MouseButton {
	LEFT("left")
	,RIGHT("right")
	,WHEEL("wheel")
	,BACK("back")
	,FORWARD("forward")
	;
	private final String button;

	/**
	 * @param button
	 */
	private MouseButton(String button) {
		this.button = button;
	}

	public static MouseButton of(final String value) {
		for (MouseButton button : values()) {
			if (button.button.equals(value)) return button;
		}
		
		throw new IllegalArgumentException("Invalid mouse button '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return button;
	}
}
