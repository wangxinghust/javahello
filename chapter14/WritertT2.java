import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 追加文件内容
 */
public class WritertT2 {
    public static void main(String[] args) throws IOException {
        File f = new File("chapter14" + File.separator + "test.txt");
        Writer out = new FileWriter(f, true);
        String str = "\r\nAAAA\r\nHello World!!!";
        out.write(str);
        out.close();
    }
}
