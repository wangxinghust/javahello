public class Leichou {
    public static void main(String[] args) {
        Chou1 abs1 = new Chou1(3, 2);
        Chou2 abs2 = new Chou2(4, 2);
        Chou abs;
        abs = abs1;
        System.out.println("after add, the value is " + abs.mathtext());
        abs = abs2;
        System.out.println("after subtract, the value is " + abs.mathtext());
    }
}

abstract class Chou {
    int a1;
    int b1;

    Chou(int a, int b) {
        a1 = a;
        b1 = b;
    }

    abstract int mathtext();
}

class Chou1 extends Chou {
    Chou1(int a, int b) {
        super(a, b);// 调用父类构造方法
    }

    int mathtext() {
        return a1 + b1;
    }
}

class Chou2 extends Chou {
    Chou2(int a, int b) {
        super(a, b);
    }

    int mathtext() {
        return a1 - b1;
    }
}