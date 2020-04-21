import java.io.IOException;
import java.io.OutputStream;

/**
 * 使用System.out向屏幕上输出指定信息
 */
public class System14T1 {
    public static void main(String[] args) {
        OutputStream out = System.out;
        try {
            out.write("hello world!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
