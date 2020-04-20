import java.io.File;
import java.io.IOException;

public class FileT3 {
    public static void main(String[] args) {
        File f = new File("chapter14" + File.separator + "test.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
