/**
 * 使用System.err输出错误信息
 */
public class System14T2 {
    public static void main(String[] args) {
        String str = "hello";
        try {
            System.err.println(Integer.parseInt(str));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
