import java.io.File;
import java.io.IOException;

public class FileT1 {
    public static void main(String[] args) {
        // 在当前项目路径下创建
        File f = new File("test.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 创建完后删除
        if (f.exists()) {
            f.delete();
            System.out.println("已删除");
        }
    }
}
