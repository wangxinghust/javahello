interface JieOne {
    int add(int a, int b);
}

interface JieTwo {
    int sub(int a, int b);
}

interface JieThree {
    int mul(int a, int b);
}

interface JieFour {
    int umul(int a, int b);
}

class JieDuo implements JieOne, JieTwo, JieThree, JieFour {
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int umul(int a, int b) {
        return a / b;
    }
}

public class jieshi {
    public static void main(String[] args) {
        JieDuo aa = new JieDuo();
        System.out.println("a+b=" + aa.add(24, 12));
        System.out.println("a-b=" + aa.sub(24, 12));
        System.out.println("a*b=" + aa.mul(24, 12));
        System.out.println("a/b=" + aa.umul(24, 12));
    }
}
