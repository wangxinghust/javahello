public class jijie {
    // 把Season类定义成不可变的，将其属性定义成final
    private final String name;
    private final String desc;
    public static final jijie SPRING = new jijie("spring", "flower");
    public static final jijie SUMMER = new jijie("summer", "bamboo");
    public static final jijie FALL = new jijie("fall", "chry");
    public static final jijie WINTER = new jijie("winter", "snow");

    public static jijie getSeason(int jijieNum) {
        switch (jijieNum) {
            case 1:
                return SPRING;
            case 2:
                return SUMMER;
            case 3:
                return FALL;
            case 4:
                return WINTER;
            default:
                return null;
        }
    }

    /**
     * 将构造器定义成private权限
     *
     * @param name
     * @param desc
     */
    private jijie(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }
}
