import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 将指定文件压缩成文件www.zip
 */
public class ZipOutputStreamT1 {
    public static void main(String[] args) throws IOException {
        File file = new File("chapter14" + File.separator + "www.txt");
        File zipFile = new File("chapter14" + File.separator + "www.zip");
        InputStream input = new FileInputStream(file);
        ZipOutputStream zipOut = null;
        // 声明压缩流对象
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        zipOut.putNextEntry(new ZipEntry(file.getName()));
        zipOut.setComment("www.www.cn");
        int temp = 0;
        while ((temp = input.read()) != -1) {
            zipOut.write(temp);
        }
        input.close();
        zipOut.close();
    }
}
