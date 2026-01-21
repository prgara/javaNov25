package jan20;

import java.io.File;
import java.io.IOException;

public class Main {

    static void main() throws IOException {
        String name = "PRAGRA";
        name = null;

        //db connection
        // file opening
        try {
            String lowerCase = name.toLowerCase();
            System.out.println(lowerCase);
        } catch (ArithmeticException e) {
            System.out.println("Null pointer caught");
//            e.printStackTrace();
        }
        finally {
//            db connection closed
            // close the file
            System.out.println("Finally block exceuted");
        }


    }
}
