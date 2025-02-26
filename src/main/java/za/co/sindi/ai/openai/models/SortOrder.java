/**
 * 
 */
package za.co.sindi.ai.openai.models;

/**
 * @author Buhake Sindi
 * @since 26 February 2025
 */
public enum SortOrder {
	ASCENDING("asc")
	,DESCENDING("desc")
	;
	private final String order;

	/**
	 * @param order
	 */
	private SortOrder(String order) {
		this.order = order;
	}
	
	public static SortOrder of(final String value) {
		for (SortOrder order : values()) {
			if (order.order.equals(value)) return order;
		}
		
		throw new IllegalArgumentException("Invalid sort order '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return order;
	}
}
