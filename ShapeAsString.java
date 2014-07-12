/**
 *
 * @author Chris Minich
 *         cfminich@gmail.com
 */

package mario;
import java.io.*;

public interface ShapeAsString {
    int promptToSetDimensions() throws IOException;
    String StructureAsString(int height);
}
