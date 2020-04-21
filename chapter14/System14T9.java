import java.io.*;

/**
 * 设置System.in的输入重定向内容
 */
public class System14T9 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("chapter14" + File.separator + "test.txt"));
        InputStream input = System.in;
        byte b[] = new byte[1024];
        int len = input.read(b);
        System.out.println("输入的内容为：" + new String(b, 0, len));
        input.close();
    }
}
