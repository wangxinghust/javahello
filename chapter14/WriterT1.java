import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 向指定文件中写入数据
 */
public class WriterT1 {
    public static void main(String[] args) throws IOException {
        File f = new File("chapter14" + File.separator + "test.txt");
        Writer out = new FileWriter(f);
        String str = "Hello World!!!";
        out.write(str);
        out.close();
    }
}
