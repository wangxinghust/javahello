public class StringBufferT5 {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello ").append("World!");
        buf.replace(6, 11, "AAA");
        System.out.println("after replace: " + buf);
    }
}
