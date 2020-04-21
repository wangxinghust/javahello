import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输入两个数字，并让两个数字相加
 */
public class ExecT1 {
    public static void main(String[] args) throws IOException {
        int i = 0;
        int j = 0;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        System.out.println("请输入一个数字：");
        str = buf.readLine();
        // 将字符串变为整数
        i = Integer.parseInt(str);
        System.out.println("请输入第二个数字：");
        str = buf.readLine();
        j = Integer.parseInt(str);
        System.out.println(i + " + " + j + " = " + (i + j));
    }
}
