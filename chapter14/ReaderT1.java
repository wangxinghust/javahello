import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 使用循环方式读取文件内容
 */
public class ReaderT1 {
    public static void main(String[] args) throws IOException {
        File f = new File("chapter14" + File.separator + "test.txt");
        Reader input = new FileReader(f);
        char c[] = new char[1024];
        int len = input.read(c); // 读取所有内容
        input.close();
        System.out.println("内容为：" + new String(c, 0, len));
    }
}
