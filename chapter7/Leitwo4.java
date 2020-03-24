public class Leitwo4 {
    protected int a;

    protected void print() {
        System.out.println("a=" + a);
    }

    public static void main(String[] args) {
        Leitwo4 a1 = new Leitwo4();
        a1.a = 2011;
        a1.print();
        ;
        Leitwo4 a2 = new Leitwo4();
        a2.a = 2102;
        a2.print();
    }
}