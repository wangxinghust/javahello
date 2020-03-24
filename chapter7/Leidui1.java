public class Leidui1 {
    int x = 12;
    int y = 23;

    public void printFoo() {
        System.out.println("x=" + x + ",y=" + y);
    }

    public static void main(String[] args) {
        Leidui1 z = new Leidui1();
        z.x = 41;
        z.y = 75;
        z.printFoo();
        Leidui1 b = new Leidui1();
        b.x = 23;
        b.y = 38;
        b.printFoo();
    }
}