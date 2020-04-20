public class YiFour {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("异常：" + e);
        }
        try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("异常：" + e);
        }
    }
}
