package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/vector-stores/search">Search Vector Store reference documentation.</a>
 */
@JsonbTypeInfo(
	key = "type",
	value = {
	    @JsonbSubtype(alias="eq", type=EqualComparisonFilter.class),
	    @JsonbSubtype(alias="ne", type=NotEqualComparisonFilter.class),
	    @JsonbSubtype(alias="gt", type=GreaterThanComparisonFilter.class),
	    @JsonbSubtype(alias="gte", type=GreaterThanEqualComparisonFilter.class),
	    @JsonbSubtype(alias="lt", type=LessThanComparisonFilter.class),
	    @JsonbSubtype(alias="lte", type=LessThanEqualComparisonFilter.class),
	}
)
public abstract class ComparisonFilter extends Filter {

	@JsonbProperty
	private String key;
	
	@JsonbProperty
	private Object value;

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		this.value = value;
	}
}
