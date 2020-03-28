import java.util.ArrayList;
import java.util.List;

public class yongList {
    public static void main(String[] args) {
        List<String> books = new ArrayList<String>();
        books.add(new String("aaa"));
        books.add(new String("bbb"));
        books.add(new String("ccc"));
        System.out.println(books);
        books.add(1, new String("ddd"));
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        books.remove(2);
        System.out.println(books);
        System.out.println(books.indexOf(new String("ddd")));
        books.set(1, new String("bbb"));
        System.out.println(books);
        System.out.println(books.subList(1, 2));
    }
}
