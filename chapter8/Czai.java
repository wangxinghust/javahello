public class Czai {
    public void test() {
        System.out.println("no parameter");
    }

    public void test(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Czai o1 = new Czai();
        o1.test();
        o1.test("hello");
    }
}
