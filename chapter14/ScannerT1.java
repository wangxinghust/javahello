import java.util.Scanner;

/**
 * 使用Scanner类输入数据
 */
public class ScannerT1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入数据：");
        String str = scan.next();
        System.out.println("输入的内容为：" + str);
    }
}
