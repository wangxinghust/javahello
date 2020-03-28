import java.util.HashMap;

public class yongNullHashMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(null, null);
        hm.put(null, null);
        hm.put("a", null);
        System.out.println(hm);
    }
}
