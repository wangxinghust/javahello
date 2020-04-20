import java.io.File;

/**
 * 创建文件夹
 */
public class FileT7 {
    public static void main(String[] args) {
        File f = new File("chapter14" + File.separator + "www");
        // 实例化File类的对象
        f.mkdir();
    }
}
