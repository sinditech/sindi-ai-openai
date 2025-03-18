package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class ComputerDragAction extends ComputerAction {
	
	@JsonbProperty
	private Path[] path;
	
	/**
	 * @return the path
	 */
	public Path[] getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(Path[] path) {
		this.path = path;
	}

	public static class Path implements Serializable {
	
		@JsonbProperty
		private int x;
		
		@JsonbProperty
		private int y;
	
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
}
