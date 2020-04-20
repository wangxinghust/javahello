public class Yichang1 {
    public static void main(String[] args) {
        int x, y;
        try {
            x = 0;
            y = 5 / x;
            System.out.println("需要检验的程序");
        } catch (ArithmeticException e) {
            System.out.println("发生了异常，分母不能为零");
        }
        System.out.println("程序运行结束");
    }
}
