/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 16 March 2024
 */
public enum SchemaTypes {
	AUTO("auto")
	,HIGH("high")
	,LOW("low")
	;
	private final String detail;

	/**
	 * @param detail
	 */
	private SchemaTypes(String detail) {
		this.detail = detail;
	}

	public static SchemaTypes of(final String value) {
		for (SchemaTypes id : values()) {
			if (id.detail.equals(value)) return id;
		}
		
		throw new IllegalArgumentException("Invalid image detail '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return detail;
	}
}
