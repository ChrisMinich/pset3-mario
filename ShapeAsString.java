/**
 *
 * @author Chris Minich
 *         cfminich@gmail.com
 */

package mario;
import java.io.*;

abstract class ShapeAsString {
    private String pyramid;

    protected abstract int promptToSetDimensions() throws IOException;
    protected abstract String StructureAsString(int height);
}
