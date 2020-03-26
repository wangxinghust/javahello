public class niming {
    // 成员匿名类
    InterfaceA a = new InterfaceA() {
    };

    public static void main(String[] args) {
        // 局部匿名类
        InterfaceA a = new InterfaceA() {
        };
        niming test = new niming() {
        };
    }

    // 定义匿名类
    private interface InterfaceA {
    }
}
