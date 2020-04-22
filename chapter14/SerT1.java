import java.io.*;

/**
 * 将Person14类的对象保存在文件中
 */
public class SerT1 {
    public static void main(String[] args) throws IOException {
        File f = new File("chapter14" + File.separator + "test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        oos.writeObject(new Person14("知乎", 3));
        oos.close();
    }
}
