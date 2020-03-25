/**
 * 定义父类
 */
class Jitwo {
    String name;
    int age;
    long number;

    Jitwo(long number, String name, int age) {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("phone number:" + number);
    }
}

/**
 * 定义子类，继承与Jitwo
 */
class Super2b extends Jitwo {
    /**
     * 构造方法
     *
     * @param number
     * @param name
     * @param age
     * @param b
     */
    Super2b(long number, String name, int age, boolean b) {
        super(number, name, age);
        System.out.println("like sports? " + b);
    }
}

public class Jione1 {
    public static void main(String[] args) {
        Super2b abc1 = new Super2b(15881, "xiao ming", 18, true);
    }
}
