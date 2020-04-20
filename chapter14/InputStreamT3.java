import java.io.*;

/**
 * 使用length()方法获取文件的长度
 */
public class InputStreamT3 {
    public static void main(String[] args) throws IOException {
        File f = new File("chapter14" + File.separator + "test.txt");
        InputStream input = new FileInputStream(f);
        byte b[] = new byte[(int) f.length()];
        int len = input.read(b);
        input.close();
        System.out.println("读入数据的长度：" + len);
        System.out.println("内容为；" + new String(b));
    }
}
