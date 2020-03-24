public class Userone1 {
    public static void main(String[] args) {
        Leitwo5 a1 = new Leitwo5();
        a1.a = 2;
        a1.b = 3;
        a1.print();
    }
}

class Leitwo5 {
    int a;
    int b;

    void print() {
        int c = a + b;
        System.out.println("a+b=" + c);
    }
}