public class Leitwo3 {
    private String uname;
    private int uid;

    public String getuname() {
        return uname;
    }

    private int getuid() {
        return uid;
    }

    public Leitwo3(String uname, int uid) {
        this.uname = uname;
        this.uid = uid;
    }

    public static void main(String[] args) {
        Leitwo3 privateUse1 = new Leitwo3("AAA", 21002);
        Leitwo3 privateUse2 = new Leitwo3("BBB", 61002);
        String a1 = privateUse1.getuname();
        System.out.println("name: " + a1);
        int a2 = privateUse1.getuid();
        System.out.println("uid: " + a2);
        String a3 = privateUse2.getuname();
        System.out.println("name: " + a3);
        int a4 = privateUse2.getuid();
        System.out.println("uid: " + a4);
    }
}