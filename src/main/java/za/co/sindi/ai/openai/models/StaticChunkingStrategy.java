package za.co.sindi.ai.openai.models;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 * @author Buhake Sindi
 * @since 15 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/assistants/createAssistant">Create Assistants reference documentation.</a>
 */
public class StaticChunkingStrategy extends ChunkingStrategy {

	@JsonbProperty("static")
	private StaticChunk _static; //We can't use the word 'static' as it's a reserved word in Java.

	/**
	 * @return the _static
	 */
	public StaticChunk get_static() {
		return _static;
	}

	/**
	 * @param _static the _static to set
	 */
	public void set_static(StaticChunk _static) {
		this._static = _static;
	}
}
