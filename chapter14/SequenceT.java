import java.io.*;

/**
 * 合并两个文件
 */
public class SequenceT {
    public static void main(String[] args) throws IOException {
        InputStream is1 = null;
        InputStream is2 = null;
        OutputStream os = null;
        SequenceInputStream sis = null;
        File f = new File("chapter14" + File.separator + "a.txt");
        f.createNewFile();
        f = new File("chapter14" + File.separator + "b.txt");
        f.createNewFile();
        is1 = new FileInputStream("chapter14" + File.separator + "a.txt");
        is2 = new FileInputStream("chapter14" + File.separator + "b.txt");
        os = new FileOutputStream("chapter14" + File.separator + "ab.txt");
        sis = new SequenceInputStream(is1, is2);
        int temp = 0;
        while ((temp = sis.read()) != -1) {
            os.write(temp);
        }
        sis.close();
        is1.close();
        is2.close();
        os.close();
    }
}
