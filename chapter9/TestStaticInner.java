public class TestStaticInner {
    private int prop1 = 5;
    private static int prop2 = 9;

    static class StaticInnerClass {
        private static int age;

        public static void main(String[] args) {
            System.out.println(prop2);
            // 无法访问，报错
            //System.out.println(prop1);
        }
    }
}
