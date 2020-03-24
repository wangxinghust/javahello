public class fuzhi {
    public static void main(String[] args) {
        byte a = 9;
        byte b = 7;
        // byte运算是自动变为int,会报错
        byte c = (byte) (a + b);
        System.out.println(c);
    }
}