public class StringBufferT1 {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("Hello ");
        buf.append("World!");
        buf.append("\n");
        buf.append("number = ").append(1).append("\n");
        buf.append("char = ").append('C').append("\n");
        buf.append("bool = ").append(true).append("\n");
        System.out.print(buf);
    }
}
