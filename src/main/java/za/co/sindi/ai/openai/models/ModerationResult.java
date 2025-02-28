/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 25 January 2024
 */
public class ModerationResult implements Serializable {

	@JsonbProperty
	private boolean flagged;
	
	@JsonbProperty
	private CategoryFlags categories;
	
	@JsonbProperty("category_scores")
	private CategoryScores categoryScores;
	
	@JsonbProperty("category_applied_input_types")
	private CategoryInputTypes categoryAppliedInputTypes;

	/**
	 * @return the flagged
	 */
	public boolean isFlagged() {
		return flagged;
	}

	/**
	 * @param flagged the flagged to set
	 */
	public void setFlagged(boolean flagged) {
		this.flagged = flagged;
	}

	/**
	 * @return the categories
	 */
	public CategoryFlags getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(CategoryFlags categories) {
		this.categories = categories;
	}

	/**
	 * @return the categoryScores
	 */
	public CategoryScores getCategoryScores() {
		return categoryScores;
	}

	/**
	 * @param categoryScores the categoryScores to set
	 */
	public void setCategoryScores(CategoryScores categoryScores) {
		this.categoryScores = categoryScores;
	}

	/**
	 * @return the categoryAppliedInputTypes
	 */
	public CategoryInputTypes getCategoryAppliedInputTypes() {
		return categoryAppliedInputTypes;
	}

	/**
	 * @param categoryAppliedInputTypes the categoryAppliedInputTypes to set
	 */
	public void setCategoryAppliedInputTypes(CategoryInputTypes categoryAppliedInputTypes) {
		this.categoryAppliedInputTypes = categoryAppliedInputTypes;
	}
}
