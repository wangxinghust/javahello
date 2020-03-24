public class Leithree1 {
    public String color = "pink";

    public void hu() {
        String color = "coffee";
        System.out.println("local variable: " + color);
        System.out.println("global variable: " + this.color);
    }

    public static void main(String[] args) {
        Leithree1 bb = new Leithree1();
        bb.hu();
    }
}