public class feijing {
    private double weight;

    public feijing() {
    }

    public feijing(double weight) {
        this.weight = weight;
    }

    /**
     * 定义一个内部类
     */
    private class feijingLeg {
        private double length;
        private String color;

        public feijingLeg(double length, String color) {
            this.length = length;
            this.color = color;
        }

        public void info() {
            System.out.println("color: " + color + ", length: " + length);
            System.out.println("weight: " + weight);
        }
    }

    public void test() {
        feijingLeg c1 = new feijingLeg(1.12, "red");
        c1.info();
    }

    public static void main(String[] args) {
        feijing feijing = new feijing(21222);
        feijing.test();
    }
}
