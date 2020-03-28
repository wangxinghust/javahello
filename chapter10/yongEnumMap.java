import java.util.EnumMap;

enum Sjiejie {
    SPRING, SUMMER, FALL, WINTER
}

public class yongEnumMap {
    public static void main(String[] args) {
        EnumMap enumMap = new EnumMap(Sjiejie.class);
        enumMap.put(Sjiejie.SUMMER, "hot");
        enumMap.put(Sjiejie.SPRING, "warm");
        System.out.println(enumMap);
    }
}
