import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Instance {
    public static void main(String[] args) throws IOException {

        PrintWriter p1 = new PrintWriter("result.txt");
        p1.write("Hello 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("result2.txt");
        p2.write("Hello 2");
        p2.close();
    }
}
