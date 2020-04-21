import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 使用正则表达式和Scanner获取日期
 */
public class ScannerT4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = null;
        Date date = null;
        System.out.println("输入日期（yyyy-MM-dd）：");
        if (scan.hasNext("^\\d{4}-\\d{2}-\\d{2}$")) {
            str = scan.next("^\\d{4}-\\d{2}-\\d{2}$");
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("输入的日期格式错误");
        }
        System.out.println(date);
    }
}
