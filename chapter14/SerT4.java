import java.io.*;

/**
 * 重新保存Person14_3，并再次读取该对象
 */
public class SerT4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ser();
        dser();
    }

    private static void dser() throws IOException, ClassNotFoundException {
        File f = new File("chapter14" + File.separator + "test.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        Object obj = ois.readObject();
        ois.close();
        System.out.println(obj);
    }

    private static void ser() throws IOException {
        File f = new File("chapter14" + File.separator + "test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        oos.writeObject(new Person14_3("李四", 33));
        oos.close();
    }
}
