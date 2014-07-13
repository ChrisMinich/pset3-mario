/**
 *
 * @author Chris Minich
 *         cfminich@gmail.com
 */

package mario;
import java.io.*;

abstract class ShapeAsString {

    protected abstract int promptToSetDimensions() throws IOException;
    protected abstract String build(int height);
}
