import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 为System.out输出重定向
 */
public class System14T6 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new FileOutputStream(new File("chapter14" + File.separator + "test.txt"))));
        System.out.print("www.***.com");
        System.out.println("，重定向");
    }
}
