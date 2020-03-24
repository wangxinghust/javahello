public class Leijing1 {
    static int x;
    static int y;

    public void printJingTai() {
        System.out.println("x=" + x + ",y=" + y);
    }

    public static void main(String[] args) {
        Leijing1 a = new Leijing1();
        a.x = 4;
        a.y = 5;
        Leijing1.x = 112;
        Leijing1.y = 252;
        a.printJingTai();
        Leijing1 b = new Leijing1();
        b.x = 3;
        b.y = 8;
        Leijing1.x = 131;
        Leijing1.y = 272;
        b.printJingTai();
    }
}