package za.co.sindi.ai.openai.response;

/**
 * @author Buhake Sindi
 * @since 17 March 2025
 * @see <a href="https://platform.openai.com/docs/api-reference/responses/create">Create Model response.</a>
 */

public enum ModelInclude {
	FILE_SEARCH_CALL_RESULTS("file_search_call.results")
	,MESSAGE_INPUT_IMAGE_URL("message.input_image.image_url")
	,COMPUTER_CALL_OUTPUT_IMAGE_URL("computer_call_output.output.image_url")
	;
	private final String include;

	/**
	 * @param include
	 */
	private ModelInclude(String include) {
		this.include = include;
	}
	
	public static ModelInclude of(final String value) {
		for (ModelInclude modelInclude : values()) {
			if (modelInclude.include.equals(value)) return modelInclude;
		}
		
		throw new IllegalArgumentException("Invalid include '" + value + "'.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return include;
	}
}
