import java.lang.ref.WeakReference;

public class TestReference {
    public static void main(String[] args) throws Exception {
        String str = new String("java develop");
        WeakReference<String> wr = new WeakReference<String>(str);
        // 切断str引用和"java develop"字符串之间的引用
        str = null;
        // 取出弱引用所引用的对象
        System.out.println(wr.get());
        // 强制垃圾回收
        System.gc();
        System.runFinalization();
        // 再次取出弱引用所引用的对象
        System.out.println(wr.get());
    }
}
