import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class InterT3 {
    public static void main(String[] args) {
        Locale zhLoc = new Locale("zh", "CN");
        Locale enLoc = new Locale("en", "US");
        Locale frLoc = new Locale("fr", "FR");
        ResourceBundle zhrb = ResourceBundle.getBundle("Message", zhLoc);
        ResourceBundle enrb = ResourceBundle.getBundle("Message", enLoc);
        ResourceBundle frrb = ResourceBundle.getBundle("Message", frLoc);
        String str1 = zhrb.getString("info");
        String str2 = enrb.getString("info");
        String str3 = frrb.getString("info");
        // 字符串格式化
        System.out.println("中文：" + MessageFormat.format(str1, "张三"));
        System.out.println("English: " + MessageFormat.format(str2, "Tony"));
        System.out.println("French: " + MessageFormat.format(str3, "Hugo"));
    }
}
