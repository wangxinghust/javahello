import java.io.*;

/**
 * 将字节输出流变为字符输出流
 */
public class OutputStreamWriterT {
    public static void main(String[] args) throws IOException {
        File f = new File("chapter14" + File.separator + "test.txt");
        Writer out = new OutputStreamWriter(new FileOutputStream(f));
        out.write("hello world!");
        out.close();
    }
}
