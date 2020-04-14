import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Java9以前版本创建不可变List的解决方案
 */
public class PreJDK9UnmodifiableList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(100);
        list.add(200);
        System.out.println("list: " + list);
        List<Integer> list2 = Collections.unmodifiableList(list);
        System.out.println("list2: " + list2);
        list.add(300);
        System.out.println("list: " + list);
        System.out.println("list2: " + list2);
    }
}
