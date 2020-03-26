public class gouchong {
    public String name;
    public int count;

    public gouchong() {

    }

    public gouchong(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        gouchong oc1 = new gouchong();
        gouchong oc2 = new gouchong("bbb", 18000);
        System.out.println(oc1.name + " " + oc1.count);
        System.out.println(oc2.name + " " + oc2.count);
    }
}
