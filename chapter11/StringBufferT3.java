public class StringBufferT3 {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("World!");
        buf.insert(0, "Hello ");
        System.out.println(buf);
        buf.insert(buf.length(), "good game!");
        System.out.println(buf);
    }
}
