public class demoHerit_1 {
    public static void main(String[] args) {
        derivedGen<Integer, String> oa = new derivedGen<>(100, "Value is");
        System.out.println(oa.getDob());
        System.out.println(oa.getOb());
        System.out.println(oa.getClass());
    }
}
