import java.util.EnumSet;

enum Season {
    SPRING, SUMMER, FALL, WINTER
}

public class yongEnumSet {
    public static void main(String[] args) {
        EnumSet<Season> es1 = EnumSet.allOf(Season.class);
        System.out.println(es1);
        // 创建一个空EnumSet集合
        EnumSet<Season> es2 = EnumSet.noneOf(Season.class);
        System.out.println(es2);
        es2.add(Season.WINTER);
        es2.add(Season.SPRING);
        System.out.println(es2);
        // 以指定枚举值创建EnumSet集合
        EnumSet<Season> es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
        System.out.println(es3);
        EnumSet<Season> es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
        System.out.println(es4);
        EnumSet<Season> es5 = EnumSet.complementOf(es4);
        System.out.println(es5);
    }
}
