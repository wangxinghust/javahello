import java.lang.reflect.Field;

public class qiantao {
    public static class Nest1 {
        private int varNest1;

        public void f() throws Exception {
            final Nest2 nest2 = new Nest2();
            nest2.varNest2 = 2;
            final Field f2 = Nest2.class.getDeclaredField("varNest2");
            f2.setInt(nest2, 2);
        }
    }

    public static class Nest2 {
        private int varNest2;
    }

    public static void main(String[] args) throws Exception {
        new Nest1().f();
    }
}
