import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class yongVector {
    public static void main(String[] args) {
        Vector<String> hs = new Vector<String>();
        hs.add("a1");
        hs.add("b2");
        hs.add("c3");
        hs.add("a1");
        hs.add("d4");
        System.out.println("output with an iterator");
        printSet(hs);
        System.out.println("output with the index");
        printSet2(hs);
    }

    private static void printSet2(Vector<String> hs) {
        Enumeration<String> elements = hs.elements();
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }
    }

    private static void printSet(Vector<String> hs) {
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
