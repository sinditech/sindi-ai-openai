/**
 * 
 */
package za.co.sindi.ai.openai.files;

import java.nio.file.Path;
import java.util.Objects;

import za.co.sindi.ai.openai.OpenAIRequest;
import za.co.sindi.ai.openai.models.FilePurpose;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public class UploadFileRequest extends OpenAIRequest {

	private static final String URI = HOST_API_PATH + "/files";
	
	private Path file;
	
	private FilePurpose purpose;
	
	/**
	 * 
	 * @param file
	 * @param purpose
	 */
	public UploadFileRequest(final Path file, final String purpose) {
		this(URI, file, purpose);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param file
	 * @param purpose
	 */
	public UploadFileRequest(final Path file, final FilePurpose purpose) {
		this(URI, file, purpose);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uri
	 * @param file
	 * @param purpose
	 */
	public UploadFileRequest(String uri, Path file, String purpose) {
		this(uri, file, FilePurpose.of(Objects.requireNonNull(purpose, "A purpose is required.")));
	}
	
	/**
	 * @param uri
	 * @param file
	 * @param purpose
	 */
	public UploadFileRequest(String uri, Path file, FilePurpose purpose) {
		super("POST", uri, "multipart/form-data");
		this.file = Objects.requireNonNull(file, "A file is required.");
		this.purpose = Objects.requireNonNull(purpose, "A purpose is required.");
	}

	/**
	 * @return the file
	 */
	public Path getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(Path file) {
		this.file = file;
	}

	/**
	 * @return the purpose
	 */
	public FilePurpose getPurpose() {
		return purpose;
	}

	/**
	 * @param purpose the purpose to set
	 */
	public void setPurpose(FilePurpose purpose) {
		this.purpose = purpose;
	}
}
