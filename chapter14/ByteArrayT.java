import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 使用内存操作流将一个大写字母转换为小写字母
 */
public class ByteArrayT {
    public static void main(String[] args) {
        String str = "HELLOWORLD";
        ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int temp = 0;
        while ((temp = bis.read()) != -1) {
            char c = (char) temp;
            bos.write(Character.toLowerCase(c));
        }
        String newStr = bos.toString();
        try {
            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newStr);
    }
}
