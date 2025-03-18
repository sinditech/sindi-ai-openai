package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class ComputerScrollAction extends ComputerAction {
	
	@JsonbProperty("scroll_x")
	private int scrollX;
	
	@JsonbProperty("scroll_y")
	private int scrollY;
	
	@JsonbProperty
	private int x;
	
	@JsonbProperty
	private int y;

	/**
	 * @return the scrollX
	 */
	public int getScrollX() {
		return scrollX;
	}

	/**
	 * @param scrollX the scrollX to set
	 */
	public void setScrollX(int scrollX) {
		this.scrollX = scrollX;
	}

	/**
	 * @return the scrollY
	 */
	public int getScrollY() {
		return scrollY;
	}

	/**
	 * @param scrollY the scrollY to set
	 */
	public void setScrollY(int scrollY) {
		this.scrollY = scrollY;
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
