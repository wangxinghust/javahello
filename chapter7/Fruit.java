class Zong {
    public static void main(String[] args) {
        System.out.println("call the class Apple's method harvest(), the result is: ");
        Apple a = new Apple();
        a.harvest();
        System.out.println("call the class Orange's method harvest(), the result is: ");
        Orange b = new Orange();
        b.harvest();
    }
}

public abstract class Fruit {
    // 定义抽象类
    public String color;

    public Fruit() {
        color = "pink";
    }

    public abstract void harvest();
}

class Apple extends Fruit {
    public void harvest() {
        System.out.println("the apple has harvested");
    }
}

class Orange extends Fruit {
    public void harvest() {
        System.out.println("the orange has harvested");
    }
}