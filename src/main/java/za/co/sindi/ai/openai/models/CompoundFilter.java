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
	    @JsonbSubtype(alias="and", type=AndCompoundFilter.class),
	    @JsonbSubtype(alias="or", type=OrCompoundFilter.class),
	}
)
public abstract class CompoundFilter extends Filter {

	@JsonbProperty
	private Filter[] filters;

	/**
	 * @return the filters
	 */
	public Filter[] getFilters() {
		return filters;
	}

	/**
	 * @param filters the filters to set
	 */
	public void setFilters(Filter[] filters) {
		this.filters = filters;
	}
}
