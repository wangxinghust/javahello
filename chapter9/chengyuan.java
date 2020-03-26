public class chengyuan {
    final int a = 6;
    final String str;
    final int c;
    final static double d;

    {
        str = "Hello";
    }

    static {
        d = 5.8;
    }

    public chengyuan() {
        c = 5;
    }

    public void changeFinal() {
        //d=1.3;
    }

    public static void main(String[] args) {
        chengyuan tf = new chengyuan();
        System.out.println(tf.a);
        System.out.println(tf.c);
        System.out.println(tf.d);
    }
}
