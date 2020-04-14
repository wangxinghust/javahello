import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("BJ", "Beijing");
        pro.setProperty("TJ", "Tianjin");
        pro.setProperty("NJ", "Nanjing");
        File file = new File("chapter10" + File.separator + "area.properties");
        System.out.println(file.getAbsoluteFile());
        try {
            pro.store(new FileOutputStream(file), "Area Infor");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
