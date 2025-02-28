/**
 * 
 */
package za.co.sindi.ai.openai.models;

import java.io.Serializable;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 25 February 2025
 */
public class FineTuningIntegration implements Serializable {
	
	@JsonbProperty
	private String type;
	
	@JsonbProperty("wandb")
	private WeightsAndBiases weightsAndBiases;
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the weightsAndBiases
	 */
	public WeightsAndBiases getWeightsAndBiases() {
		return weightsAndBiases;
	}

	/**
	 * @param weightsAndBiases the weightsAndBiases to set
	 */
	public void setWeightsAndBiases(WeightsAndBiases weightsAndBiases) {
		this.weightsAndBiases = weightsAndBiases;
	}

	public static class WeightsAndBiases implements Serializable {
		
		@JsonbProperty
		private String project;
		
		@JsonbProperty
		private String name;
		
		@JsonbProperty
		private String entity;
		
		@JsonbProperty
		private String[] tags;

		/**
		 * @return the project
		 */
		public String getProject() {
			return project;
		}

		/**
		 * @param project the project to set
		 */
		public void setProject(String project) {
			this.project = project;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the entity
		 */
		public String getEntity() {
			return entity;
		}

		/**
		 * @param entity the entity to set
		 */
		public void setEntity(String entity) {
			this.entity = entity;
		}

		/**
		 * @return the tags
		 */
		public String[] getTags() {
			return tags;
		}

		/**
		 * @param tags the tags to set
		 */
		public void setTags(String[] tags) {
			this.tags = tags;
		}
	}
}
