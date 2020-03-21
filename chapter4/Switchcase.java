public class Switchcase {
    public static void main(String[] args) {
        int a = 111;
        switch (a) {
            case 111:
            case 222:
            case 333:
                System.out.println("a=111|a=222|a=333");
            default:
                System.out.println("no");
        }
    }
}