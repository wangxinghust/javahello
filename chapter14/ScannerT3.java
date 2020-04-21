import java.util.Scanner;

/**
 * 使用方法hasNextXxx()进行验证
 */
public class ScannerT3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;
        System.out.println("输入整数");
        if (scan.hasNextInt()) {
            i = scan.nextInt();
            System.out.println("整数数据为：" + i);
        } else {
            System.out.println("输入的数据不是整数");
        }
        System.out.println("输入小数");
        if (scan.hasNextFloat()) {
            f = scan.nextFloat();
            System.out.println("小数数据为：" + f);
        } else {
            System.out.println("输入的数据不是小苏");
        }
    }
}
