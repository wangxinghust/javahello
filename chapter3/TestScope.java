public class TestScope {
    public static void main(String[] args) {
        int x = 12;
        int q = 96;
        System.out.println("x is " + x);
        System.out.println("q is " + q);
        q = x;
        System.out.println("x is " + x);
    }
}