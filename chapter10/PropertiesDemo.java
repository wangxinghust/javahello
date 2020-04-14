import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties pro = new Properties();
        File file = new File("chapter10" + File.separator + "area.properties");
        try {
            pro.load(new FileInputStream(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("value of BJ exist, and the value is " + pro.getProperty("BJ"));
    }
}
