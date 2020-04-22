import java.util.stream.Stream;

/**
 * 使用Stream.of()方法将参数转换为一个流
 */
public class T6 {
    public static void main(String[] args) {
        // 使用静态的Stream.of()方法
        Stream<String> words = Stream.of("ab,cd,ef,gh".split(","));
        System.out.printf("num:%d", words.count());
    }
}
