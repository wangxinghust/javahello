import java.util.WeakHashMap;

public class yongWeakHashMap {
    public static void main(String[] args) {
        WeakHashMap<String, String> whm = new WeakHashMap<String, String>();
        whm.put(new String("Chinese"), new String("99"));
        whm.put(new String("Math"), new String("89"));
        whm.put(new String("English"), new String("79"));
        whm.put("java", new String("69"));
        whm.put(new String("test"), "windows");
        System.out.println(whm);
        System.gc();
        System.runFinalization();
        System.out.println(whm);
    }
}
