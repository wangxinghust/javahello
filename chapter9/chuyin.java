public class chuyin {
    public String name;
    public int count;

    /**
     * 自定义构造器
     *
     * @param name
     * @param count
     */
    public chuyin(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        chuyin tc = new chuyin("aaa", 20000);
        System.out.println(tc.name);
        System.out.println(tc.count);
    }
}
