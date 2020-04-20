public class Yitwo2 {
    public static void main(String[] args) {
        try {
            int age = Integer.parseInt("23L");
            System.out.println("输出1");
        } catch (NumberFormatException e) {
            int b = 8 / 0;
            System.out.println("请输入整数年龄");
            System.out.println("错误" + e.getMessage());
        } finally {
            System.out.println("输出2");
        }
        System.out.println("输出3");
    }
}
