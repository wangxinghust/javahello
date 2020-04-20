import java.io.*;

/**
 * 未知内容时读取文件的内容
 */
public class InputStreamT5 {
    public static void main(String[] args) throws IOException {
        File f = new File("chapter14" + File.separator + "test.txt");
        InputStream input = new FileInputStream(f);
        byte b[] = new byte[1024];
        int len = 0;
        int temp = 0;
        while ((temp = input.read()) != -1) {
            b[len] = (byte) temp;
            len++;
        }
        input.close();
        System.out.println("内容为：" + new String(b, 0, len));
    }
}
