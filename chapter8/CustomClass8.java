interface CustomInterface8 {
    public abstract void method1();

    /**
     * 接口中的默认方法
     */
    public default void method2() {
        System.out.println("default method");
    }

    /**
     * 接口中的静态方法
     */
    public static void method3() {
        System.out.println("static method");
    }
}

public class CustomClass8 implements CustomInterface8 {
    /**
     * 实现抽象方法
     */
    @Override
    public void method1() {
        System.out.println("abstract method");
    }

    public static void main(String[] args) {
        CustomInterface8 instance = new CustomClass8();
        instance.method1();
        instance.method2();
        CustomInterface8.method3();
    }
}
