import java.io.IOException;
import java.io.InputStream;

/**
 * 从键盘读取数据
 */
public class System14T4 {
    public static void main(String[] args) throws IOException {
        InputStream input = System.in;
        // 从键盘接受数据
        byte b[] = new byte[5];
        System.out.println("请输入内容：");
        int len = input.read(b);
        System.out.println("输入的内容为：" + new String(b, 0, len));
        input.close();
    }
}
