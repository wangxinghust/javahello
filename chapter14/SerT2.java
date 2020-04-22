import java.io.*;

/**
 * 将Person14对象实现反序列化（读取）操作
 */
public class SerT2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f = new File("chapter14" + File.separator + "test.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        Object obj = ois.readObject();
        ois.close();
        System.out.println(obj);
    }
}
