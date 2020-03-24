class BaoTwo {
    public static void main(String[] args) {
        Leibao a1 = new Leibao();
        a1.a = 121;
        a1.b = 232;
        a1.print();
    }
}

public class Leibao {
    int a;
    int b;

    public void print() {
        System.out.println("a=" + a + ",b=" + b);
    }
}