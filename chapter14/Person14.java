import java.io.Serializable;

/**
 * 定义一个可序列化的类
 */
public class Person14 implements Serializable {
    private String name;
    private int age;


    public Person14(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名：" + this.name + "；年龄：" + this.age;
    }
}
