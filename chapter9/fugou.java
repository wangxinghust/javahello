class Base {
    public double size;
    public String name;

    public Base(double size, String name) {
        this.size = size;
        this.name = name;
    }
}

public class fugou extends Base {
    public String color;

    public fugou(double size, String name, String color) {
        super(size, name);
        this.color = color;
    }

    public static void main(String[] args) {
        fugou s = new fugou(9.1, "test", "red");
        System.out.println(s.size + "--" + s.name + "--" + s.color);
    }
}
