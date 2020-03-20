public class Quan {
    //设置全局变量
    byte x;
    short y;
    int z;
    long a;
    float b;
    double c;
    char d;
    boolean e;

    //设置变量的值并输出
    public static void main(String[] args) {
        int z1 = 111;
        System.out.println("z1=" + z1);
        Quan m = new Quan();
        System.out.println("x=" + m.x);
        System.out.println("y=" + m.y);
        System.out.println("a=" + m.a);
        System.out.println("b=" + m.b);
        System.out.println("c=" + m.c);
        System.out.println("d=" + m.d);
        System.out.println("e=" + m.e);
    }
}