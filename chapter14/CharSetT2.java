import java.io.*;

/**
 * 使用getBytes()方法产生乱码
 */
public class CharSetT2 {
    public static void main(String[] args) throws IOException {
        File f = new File("chapter14" + File.separator + "test.txt");
        OutputStream out = new FileOutputStream(f);
        byte b[] = "中国，你好！".getBytes("GBK");// 根据系统格式来修改要转换的格式，以达到乱码的效果
        out.write(b);
        out.close();
    }
}
