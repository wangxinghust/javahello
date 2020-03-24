public class Dog {
    String name;
    int age;

    public Dog() {
        System.out.println("construction method");
    }

    void brak() {
        System.out.println("bark!!!");
    }

    void hungry() {
        System.out.println("hungry!!!");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
    }
}