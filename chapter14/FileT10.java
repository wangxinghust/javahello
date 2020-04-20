import java.io.File;

/**
 * 判断一个给定路径是否是目录
 */
public class FileT10 {
    public static void main(String[] args) {
        File f = new File("chapter" + File.separator);
        // isDirectory: Tests whether the file denoted by this abstract pathname is a directory.
        if (f.isDirectory()) {
            System.out.println(f.getPath() + "路径是目录");
        } else {
            System.out.println(f.getPath() + "路径不是目录");
        }
    }
}
