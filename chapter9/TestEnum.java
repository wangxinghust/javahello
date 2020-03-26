public class TestEnum {
    public void judge(jijieEnum s) {
        //switch语句里的表达式可以是枚举值
        switch (s) {
            case SPRING:
                System.out.println("spring");
                break;
            case SUMMER:
                System.out.println("summer");
                break;
            case FALL:
                System.out.println("fall");
                break;
            case WINTER:
                System.out.println("winter");
                break;
        }
    }

    public static void main(String[] args) {
        for (jijieEnum s : jijieEnum.values()) {
            System.out.println(s);
        }
        new TestEnum().judge(jijieEnum.SPRING);
    }
}
