public class ren {
    // 定义一个初始化块
    {
        int a = 6;
        if (a > 4) {
            System.out.println("ren initialization block: variable > 4");
        }
        System.out.println("ren initialization block");
    }

    {
        System.out.println("ren second initialization block");
    }

    /**
     * 定义无参构造函数
     */
    public ren() {
        System.out.println("no parameter constructor");
    }

    public static void main(String[] args) {
        new ren();
    }
}
