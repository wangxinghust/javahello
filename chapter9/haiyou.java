class dongwu2 {
    private void beat() {
        System.out.println("beat");
    }

    public void breath() {
        beat();
        System.out.println("breath");
    }
}

class niao2 {
    // 将原来的父类嵌入到原来的子类中，作为子类的一个组合部分
    private dongwu2 a;

    public niao2(dongwu2 a) {
        this.a = a;
    }

    /**
     * 重新定义一个自己的breath()方法
     */
    public void breath() {
        // 直接复用dongwu2提供的breath()方法来实现niao2的breath()方法
        a.breath();
    }

    public void fly() {
        System.out.println("fly");
    }
}

class nnn2 extends dongwu2 {
    private dongwu2 a;

    public nnn2(dongwu2 a) {
        this.a = a;
    }

    public void breath() {
        a.breath();
    }

    public void run() {
        System.out.println("run");
    }
}

public class haiyou {
    public static void main(String[] args) {
        // 此时需要显示的创建被嵌入的对象
        dongwu2 a1 = new dongwu2();

        niao2 b = new niao2(a1);
        b.breath();
        b.fly();
        nnn2 w = new nnn2(a1);
        w.breath();
        w.run();
    }
}
