public class LocalInnerClass {
    public static void main(String[] args) {
        /**
         * 定义局部内部类
         */
        class InnerBase {
            int a;
        }
        /**
         * 定义局部内部类的子类
         */
        class InnerSub extends InnerBase {
            int b;
        }
        // 创建局部内部类
        InnerSub is = new InnerSub();
        is.a = 58;
        is.b = 888;
        System.out.println("a= " + is.a + ", b= " + is.b);
    }
}
