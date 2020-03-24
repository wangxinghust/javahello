public class Bian {
    // 定义形参长度可变的方法test
    public static void test(int a, String... books) {
        // books当做数组来处理
        for (String tmp : books) {
            System.out.println(tmp);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        test(5, "AAA", "BBB");
        test(23, new String[]{"CCC", "DDD", "EEE"});
    }
}