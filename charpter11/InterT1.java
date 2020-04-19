import java.util.ResourceBundle;

public class InterT1 {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("Message");
        System.out.println("content: " + rb.getString("info"));
    }
}
