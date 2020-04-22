import java.nio.CharBuffer;

/**
 * 使用Buffer类中的常规操作方法
 */
public class BufferTest {
    public static void main(String[] args) {
        // 创建Buffer
        CharBuffer buff = CharBuffer.allocate(8);
        System.out.println("capacity: " + buff.capacity());
        System.out.println("limit: " + buff.limit());
        System.out.println("position: " + buff.position());
        // 放入元素
        buff.put('a');
        buff.put('b');
        buff.put('c');
        System.out.println("加入3个元素后，position= " + buff.position());
        // 调用flip()方法
        buff.flip();
        System.out.println("执行flip()方法后，limit= " + buff.limit());
        System.out.println("position= " + buff.position());
        // 取出第一个元素
        System.out.println("第一个元素：" + buff.get());
        System.out.println("取出第一个元素后，position= " + buff.position());
        // 调用clear()方法
        buff.clear();
        System.out.println("执行clear()后，limit= " + buff.limit());
        System.out.println("执行clear()后，position= " + buff.position());
        System.out.println("执行clear()后，缓冲区的内容并没有清除：" + buff.get(2));
        System.out.println("执行绝对读取后，position= " + buff.position());
    }
}
