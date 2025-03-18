/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/list">Role</a>
 */
public enum Role {
	USER("user")
	,SYSTEM("system")
	,DEVELOPER("developer")
	,ASSISTANT("assistant")
	;
	private final String role;

	/**
	 * @param role
	 */
	private Role(String role) {
		this.role = role;
	}
	
	public static Role of(final String value) {
		for (Role role : values()) {
			if (role.role.equals(value)) return role;
		}
		
		throw new IllegalArgumentException("Invalid role '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return role;
	}
}
