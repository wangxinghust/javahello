import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class tihuan {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        Collections.addAll(all, "I MLDN", "2 LXH", "3 mldnjava");
        System.out.println("before swap: ");
        Iterator<String> iter = all.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + ", ");
        }
        Collections.swap(all, 0, 2);
        System.out.println("\nafter swap: ");
        iter = all.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + ", ");
        }
    }
}
