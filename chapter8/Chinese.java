class Ren {
    public static void prt(String s) {
        System.out.println(s);
    }

    Ren() {
        prt("A person");
    }

    Ren(String name) {
        prt("A person' name: " + name);
    }
}

public class Chinese extends Ren {
    Chinese() {
        super();
        prt("A chinese.");
    }

    Chinese(String name) {
        super(name);
        prt("his name is: " + name);
    }

    Chinese(String name, int age) {
        this(name);
        prt("his age is: " + age);
    }

    public static void main(String[] args) {
        Chinese cn = new Chinese();
        cn = new Chinese("keevin");
        cn = new Chinese("kevin", 22);
    }
}
