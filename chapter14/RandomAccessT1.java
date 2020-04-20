import java.io.File;
import java.io.RandomAccessFile;

/**
 * 使用RandomAccessFile类写入数据
 */
public class RandomAccessT1 {
    public static void main(String[] args) throws Exception {
        File f = new File("chapter14" + File.separator + "test.txt");
        RandomAccessFile rdf = null;
        rdf = new RandomAccessFile(f, "rw");
        String name = null;
        int age = 0;
        name = "aaaaaaaa";
        age = 30;
        rdf.writeBytes(name);
        rdf.writeInt(age);
        name = "bbbb    ";
        age = 31;
        rdf.writeBytes(name);
        rdf.writeInt(age);
        name = "cccccc  ";
        age = 32;
        rdf.writeBytes(name);
        rdf.writeInt(age);
        rdf.close();
    }
}
