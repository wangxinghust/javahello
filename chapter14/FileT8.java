import java.io.File;

/**
 * 使用list()方法列出一个目录中的全部内容
 */
public class FileT8 {
    public static void main(String[] args) {
        File f = new File("chapter14" + File.separator);
        String str[] = f.list();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
