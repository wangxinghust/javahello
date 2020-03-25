interface newjie {
    void print();

    public void print1();

    abstract void print2();

    public abstract void print3();

    abstract public void print4();
}

class newjie1 implements newjie {
    public void print() {
        System.out.println("no public abstract");
    }

    public void print1() {
        System.out.println("no public ");
    }

    public void print2() {
        System.out.println("no abstract");
    }

    public void print3() {
        System.out.println("all have");
    }

    public void print4() {
        System.out.println("reverse");
    }
}

class cuofang {
    public static void main(String[] args) {
        newjie1 a1 = new newjie1();
        a1.print();
        a1.print1();
        a1.print2();
        a1.print3();
        a1.print4();
    }
}