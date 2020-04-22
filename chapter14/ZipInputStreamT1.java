import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * 获取www.zip中的一个ZipEntry
 */
public class ZipInputStreamT1 {
    public static void main(String[] args) throws IOException {
        File zipFile = new File("chapter14" + File.separator + "www2.zip");
        ZipInputStream input = null;
        input = new ZipInputStream(new FileInputStream(zipFile));
        ZipEntry entry = input.getNextEntry();
        System.out.println("压缩实体名称：" + entry.getName());
        input.close();
    }
}
