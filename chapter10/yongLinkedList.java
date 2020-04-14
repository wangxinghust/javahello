import java.util.LinkedList;

public class yongLinkedList {
    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<String>();
        books.offer("android");
        books.push("push");
        books.offerFirst("offerFirst");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        System.out.println(books.peekFirst());
        System.out.println(books.peekLast());
        System.out.println(books.pop());
        System.out.println(books);
        System.out.println(books.pollLast());
        System.out.println(books);
    }
}
