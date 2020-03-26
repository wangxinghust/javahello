class jiBaseClass {
    public int book = 6;

    public void base() {
        System.out.println("A common method of a parent class");
    }

    public void test() {
        System.out.println("The method in which the parent class is overridden");
    }
}

public class duotai extends jiBaseClass {
    public String book = "Android";

    public void test() {
        System.out.println("Subclasses override methods of the parent class");
    }

    public void sub() {
        System.out.println("A common method of a sub class");
    }

    public static void main(String[] args) {
        jiBaseClass bc = new jiBaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();

        duotai sc = new duotai();
        System.out.println(sc.book);
        sc.base();
        sc.test();
        sc.sub();

        jiBaseClass sanYin = new duotai();
        System.out.println(sanYin.book);
        sanYin.base();
        sanYin.test();
        //sanYin.sub();
    }
}
