interface CustomInterface9 {
    public abstract void method1();

    public default void method2() {
        method4();
        method5();
        System.out.println("default method");
    }

    public static void method3() {
        method5();
        System.out.println("static method");
    }

    /**
     * 接口中的私有方法
     */
    private void method4() {
        System.out.println("private method");
    }

    /**
     * 接口中的私有静态方法
     */
    private static void method5() {
        System.out.println("private static method");
    }

}

public class CustomeClass9 implements CustomInterface9 {
    @Override
    public void method1() {
        System.out.println("abstract method");
    }

    public static void main(String[] args) {
        CustomInterface9 instance = new CustomeClass9();
        instance.method1();
        instance.method2();
        CustomInterface9.method3();
    }
}
