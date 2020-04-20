import java.io.*;

/**
 * 从文件中读取内容
 */
public class InputStreamT1 {
    public static void main(String[] args) throws IOException {
        File f = new File("chapter14" + File.separator + "test.txt");
        InputStream input = null;
        input = new FileInputStream(f);
        // 读缓冲区
        byte b[] = new byte[1024];
        input.read(b);
        input.close();
        System.out.println("内容为：" + new String(b));
    }
}
