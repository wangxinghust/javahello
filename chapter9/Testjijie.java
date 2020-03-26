public class Testjijie {
    public Testjijie(jijie s) {
        System.out.println(s.getName() + ", has " + s.getDesc());
    }

    public static void main(String[] args) {
        new Testjijie(jijie.FALL);
    }
}
