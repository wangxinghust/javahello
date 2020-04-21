import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 使用Scanner读取文件的内容
 */
public class ScannerT5 {
    public static void main(String[] args) {
        File f = new File("chapter14" + File.separator + "test.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringBuffer str = new StringBuffer();
        while (scan.hasNext()) {
            str.append(scan.next()).append('\n');
        }
        System.out.println("文件内容为：" + str);
    }
}
