public interface Jiechang {
    int a = 100;
    int b = 200;
    int c = 323;
    int d = 234;
    int f = 523;

    void print();

    void print1();
}

class Jiedo implements Jiechang {
    public void print() {
        System.out.println(a + b);
    }

    public void print1() {
        System.out.println(c + d + f);
    }
}

class Jie {
    public static void main(String[] args) {
        Jiedo a1 = new Jiedo();
        a1.print();
        a1.print1();
    }
}
