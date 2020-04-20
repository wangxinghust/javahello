public class YiThree1 {
    public void methodName(int x) throws
            ArrayIndexOutOfBoundsException, ArithmeticException {
        System.out.println(x);
        if (x == 0) {
            System.out.println("没有异常");
            return;
        } else if (x == 1) {
            int[] a = new int[3];
            a[3] = 5;
        } else if (x == 2) {
            int i = 0;
            int j = 5 / i;
        }
    }

    public static void main(String[] args) {
        YiThree1 ab = new YiThree1();
        try {
            ab.methodName(0);
        } catch (Exception e) {
            System.out.println("异常：" + e);
        }
        try {
            ab.methodName(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("异常：" + e);
        }
        try {
            ab.methodName(2);
        } catch (ArithmeticException e) {
            System.out.println("异常：" + e);
        }
    }
}
