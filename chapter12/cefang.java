import java.util.ArrayList;
import java.util.Collection;

public class cefang {
    // 声明一个泛型方法，该泛型方法中带一个T形参
    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] oa = new Object[200];
        Collection<Object> co = new ArrayList<Object>();
        // T代表Object
        fromArrayToCollection(oa, co);
        String[] sa = new String[200];
        Collection<String> cs = new ArrayList<String>();
        // T代表String
        fromArrayToCollection(sa, cs);
        Integer[] ia = new Integer[200];
        Float[] fa = new Float[200];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList<>();

        fromArrayToCollection(ia, cn);
        fromArrayToCollection(fa, cn);
        fromArrayToCollection(na, cn);
        fromArrayToCollection(na, co);
        // 编译错误
        //fromArrayToCollection(na,cs);
    }
}
