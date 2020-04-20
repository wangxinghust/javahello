public class Yitwo1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            a[6] = 123;
            System.out.println("需要检验的程序");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("发生了ArrayIndexOutOfBoundsException异常");
        } catch (ArithmeticException e) {
            System.out.println("发生了ArithmeticException异常");
        } catch (Exception e) {
            System.out.println("发生了Exception异常");
        }
        System.out.println("结束");
    }
}
