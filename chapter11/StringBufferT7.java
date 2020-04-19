public class StringBufferT7 {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello ").append("World!");
        buf.replace(6, 11, "AAA");
        String str = buf.delete(6, 15).toString();
        System.out.println("after delete: " + str);
    }
}
