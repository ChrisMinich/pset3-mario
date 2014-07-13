/**
 *
 * @author Chris Minich
 *         cfminich@gmail.com
 */

package mario;
import java.io.*;

class Pyramid extends ShapeAsString {
    private String pyramid;

    public Pyramid() throws IOException {
        pyramid = StructureAsString(promptToSetDimensions());
    }

    private int promptToSetDimensions() throws IOException {
        int height = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter height (2 - 23): ");
        do {
            try{
                height = Integer.parseInt(br.readLine());
            }
            catch (NumberFormatException nfe) {
                System.err.println("Invalid Format!");
            }
        } while ((height < 2) || (height > 23));
        return height;
    }

    @Override
    public String toString() {
        return pyramid;
    }

    private String StructureAsString(int height) {
        StringBuilder structure = new StringBuilder();

        for (int row = 1; row <= height; row++) {
            int spaces = height - row;
            for (int col = 1; col <= height; col++) {
                if (col <= spaces) structure.append(" ");
                else structure.append("#");
            }
            structure.append("#\n");
        }
        return structure.toString();
    }

}
