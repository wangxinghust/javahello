class dongwu {
    private void beat() {
        System.out.println("beat");
    }

    public void breath() {
        beat();
        System.out.println("breath");
    }
}

class niao extends dongwu {
    public void fly() {
        System.out.println("fly");
    }
}

class nnn extends dongwu {
    public void run() {
        System.out.println("run");
    }
}

public class jiben {
    public static void main(String[] args) {
        niao b = new niao();
        b.breath();
        b.fly();
        nnn w = new nnn();
        w.breath();
        w.run();
    }
}
