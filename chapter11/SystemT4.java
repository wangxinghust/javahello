class Person11 {
    private String name;
    private int age;

    public Person11(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "姓名" + this.name + "，年龄" + this.age;
    }

    // deprecated API usage
    // JDK9之后被弃用
    @Override
    public void finalize() throws Throwable {
        System.out.println("the object is freed->" + this);
    }
}

public class SystemT4 {
    public static void main(String[] args) {
        Person11 per = new Person11("张三", 30);
        per = null;
        System.gc();
    }
}
