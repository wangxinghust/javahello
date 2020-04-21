import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 压缩文件夹www
 */
public class ZipOutputStreamT2 {
    public static void main(String[] args) throws IOException {
        File file = new File("chapter14" + File.separator + "www");
        File zipFile = new File("chapter14" + File.separator + "www2.zip");
        InputStream input = null;
        ZipOutputStream zipOut = null;
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        zipOut.setComment("www.baidu.com");
        int temp = 0;
        if ((file.isDirectory())) {
            File lists[] = file.listFiles();
            for (int i = 0; i < lists.length; i++) {
                input = new FileInputStream(lists[i]);
                zipOut.putNextEntry(new ZipEntry(file.getName() + File.separator + lists[i].getName()));
                while ((temp = input.read()) != -1) {
                    zipOut.write(temp);
                }
                input.close();
            }
        }
        zipOut.close();
    }
}
