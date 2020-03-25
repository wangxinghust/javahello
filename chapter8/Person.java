public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if (name.length() > 8 || name.length() < 1) {
            System.out.println("not conform");
            return;
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age > 200 || age < 0) {
            System.out.println("age not conform");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }
}
