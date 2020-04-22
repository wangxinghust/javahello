import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

/**
 * 实例化ZipFile类对象
 */
public class ZipFileT1 {
    public static void main(String[] args) throws IOException {
        File file = new File("chapter14" + File.separator + "www2.zip");
        ZipFile zipFile = new ZipFile(file);
        System.out.println("压缩文件的名称：" + zipFile.getName());
        System.out.println("压缩文件的注释：" + zipFile.getComment());
    }
}
