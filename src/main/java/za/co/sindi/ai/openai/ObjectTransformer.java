/**
 * 
 */
package za.co.sindi.ai.openai;

import java.io.InputStream;

/**
 * @author Buhake Sindi
 * @since 24 January 2024
 */
public interface ObjectTransformer {

	public <E> String transform(final E object);
	public <E> E transform(final String data, final Class<E> type);
	public <E> E transform(final InputStream stream, final Class<E> type);
}
