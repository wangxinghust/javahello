interface CustomInterface7 {
    public abstract void method();
}

public class CustomClass7 implements CustomInterface7 {

    @Override
    public void method() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        CustomInterface7 instance = new CustomClass7();
        instance.method();
    }
}
