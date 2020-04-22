import java.io.Serializable;

/**
 * 设置Person14_3中name属性不希望被序列化
 */
public class Person14_3 implements Serializable {
    private transient String name;
    private int age;

    public Person14_3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person14_3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
