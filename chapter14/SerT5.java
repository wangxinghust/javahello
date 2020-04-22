import java.io.*;

/**
 * 序列化多个Person14对象
 * 将Person14[]当做对象进行序列化即可
 */
public class SerT5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person14 per[] = {new Person14("张三", 3),
                new Person14("李四", 4), new Person14("王五", 5)};
        ser(per);
        Object[] o = (Object[]) dser(per);
        for (int i = 0; i < o.length; i++) {
            Person14 p = (Person14) o[i];
            System.out.println(p);
        }
    }

    private static Object[] dser(Person14[] per) throws IOException, ClassNotFoundException {
        File f = new File("chapter14" + File.separator + "test.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        Object obj[] = (Object[]) ois.readObject();
        ois.close();
        return obj;
    }

    private static void ser(Person14[] per) throws IOException {
        File f = new File("chapter14" + File.separator + "test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        oos.writeObject(per);
        oos.close();
    }
}
