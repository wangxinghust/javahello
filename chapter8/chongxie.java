public class chongxie {
    void print() {
        System.out.println("super class method");
    }
}

class Chongxieone extends chongxie {
    /**
     * 重写父类方法
     */
    void print() {
        System.out.println("subclass method");
    }
}
