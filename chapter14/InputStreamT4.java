import java.io.*;

/**
 * 使用read()方法进行循环读取操作
 */
public class InputStreamT4 {
    public static void main(String[] args) throws IOException {
        File f = new File("chapter14" + File.separator + "test.txt");
        InputStream input = new FileInputStream(f);
        byte b[] = new byte[(int) f.length()];
        for (int i = 0; i < b.length; i++) {
            // 以数字的方式读取，强制转化为byte
            b[i] = (byte) input.read();
        }
        input.close();
        System.out.println("内容为：" + new String(b));
    }
}
