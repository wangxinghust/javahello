import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * 使用PrintStream输出
 * 保存到文件更加方便
 */
public class PrintT1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = null;
        ps = new PrintStream(new FileOutputStream(new File("chapter14" + File.separator + "test.txt")));
        ps.print("hello");
        ps.println("world!!");
        ps.print("1+1=" + 2);
        ps.close();
    }
}
