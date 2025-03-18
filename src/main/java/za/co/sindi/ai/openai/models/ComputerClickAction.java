package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class ComputerClickAction extends ComputerAction {

	@JsonbProperty
	public MouseButton button;
	
	@JsonbProperty
	private int x;
	
	@JsonbProperty
	private int y;

	/**
	 * @return the button
	 */
	public MouseButton getButton() {
		return button;
	}

	/**
	 * @param button the button to set
	 */
	public void setButton(MouseButton button) {
		this.button = button;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
}
