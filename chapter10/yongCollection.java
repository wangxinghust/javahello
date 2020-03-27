import java.util.*;

public class yongCollection {
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Collection<Comparable> c = new ArrayList<Comparable>();
        c.add("mei");
        c.add(6);
        System.out.println("1 the size of collection is " + c.size());
        c.remove(6);
        System.out.println("2 the size of collection is " + c.size());
        // 判断是否包含指定字符串
        System.out.println("3 contanins mei? " + c.contains("mei"));
        c.add("Android");
        System.out.println("4 Collection c: " + c);
        Collection books = new HashSet();
        books.add("java");
        books.add("python");
        books.add("Android");
        System.out.println("5 is c containsAll books? " + c.containsAll(books));
        // 删除集合c中books集合包含的所有元素
        c.removeAll(books);
        System.out.println("6 Collection c: " + c);
        c.clear();
        System.out.println("7 Collection c: " + c);
        books.retainAll(c);
        System.out.println("8 Collection books: " + books);
    }
}
