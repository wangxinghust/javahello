public class zero {
    public static void main(String[] args) {
        Factory a1 = new Factory();
        Factory a2 = new Factory("hope ham", 92099, 25, "Sha county steamed dumpling", "Jinhua snacks");
        Factory a3 = new Factory(a2);
        System.out.println(a1.badder);
        System.out.println(a1.factory);
        a1.print();
        System.out.println(a2.badder);
        System.out.println(a2.factory);
        a2.print();
        a3.print();
    }
}

class Duolei {
    String bname;
    int bid;
    int bprice;

    Duolei() {
        bname = "mutton shashik";
        bid = 14002;
        bprice = 45;
    }

    Duolei(Duolei a) {
        bname = a.bname;
        bid = a.bid;
        bprice = a.bprice;
    }

    Duolei(String name, int id, int price) {
        bname = name;
        bid = id;
        bprice = price;
    }

    void print() {
        System.out.println("name of snack is: " + bname + " serial number is: " + bid + " price: " + bprice);
    }
}

class Badder extends Duolei {
    String badder;

    Badder() {
        super();
        badder = "Sha county snack";
    }

    Badder(Badder b) {
        super(b);
        badder = b.badder;
    }

    Badder(String x, int y, int z, String aa) {
        super(x, y, z);
        badder = aa;
    }
}

class Factory extends Badder {
    String factory;

    Factory() {
        super();
        factory = "snacks in Chengdu";
    }

    Factory(Factory c) {
        super(c);
        factory = c.factory;
    }

    Factory(String x, int y, int z, String l, String n) {
        super(x, y, z, l);
        factory = n;
    }
}
