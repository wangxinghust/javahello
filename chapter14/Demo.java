/**
 * 使用try...with...resources语句自动关闭资源
 */

class Resource implements AutoCloseable {
    void doSome() {
        System.out.println("实现一个功能");
    }

    @Override
    public void close() throws Exception {
        System.out.println("资源被关闭");
    }
}

public class Demo {
    public static void main(String[] args) {
        try (Resource res = new Resource()) {
            res.doSome();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
