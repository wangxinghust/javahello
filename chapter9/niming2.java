public class niming2 {
    public void test(Bird bird) {
        System.out.println(bird.getName() + " fly " + bird.fly() + " meter.");
    }

    public static void main(String[] args) {
        niming2 test = new niming2();
        test.test(new Bird() {
            public int fly() {
                return 8000;
            }

            public String getName() {
                return "wild goose";
            }
        });
    }
}
