import java.util.IdentityHashMap;

public class yongIdentityHashMap {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> ihm = new IdentityHashMap<>();
        ihm.put(new String("Chinese"), 77);
        ihm.put(new String("Math"), 87);
        ihm.put("Java", 97);
        ihm.put("Java", 67);
        System.out.println(ihm);
    }
}
