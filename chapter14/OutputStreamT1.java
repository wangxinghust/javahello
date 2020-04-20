import java.io.*;

/**
 * 向文件中写入字符串
 */
public class OutputStreamT1 {
    public static void main(String[] args) throws IOException {
        File f = new File("chapter14" + File.separator + "test.txt");
        OutputStream out = null;
        out = new FileOutputStream(f);
        String str = "Hello World!";
        byte b[] = str.getBytes();
        out.write(b);
        out.close();
    }
}
