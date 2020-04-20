import java.io.FileInputStream;
import java.io.IOException;

/**
 * 访问异常信息
 */
public class fangwen {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }
    }
}
