package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */
public class Message extends Item {

	@JsonbProperty
	private Content[] content;
	
	@JsonbProperty
	private String id;
	
	@JsonbProperty
	private Role role;

	/**
	 * @return the content
	 */
	public Content[] getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(Content[] content) {
		this.content = content;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}
}
