package mythread;

/**
 * 使用volatile关键字
 */
public class Counter1 {
    public volatile static int count = 0;

    public static void inc() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Counter1.inc();
                }
            }).start();
        }
        // 运行结果依旧随机
        // 因为递增运算不是原子操作
        System.out.println("运行结果：Counter1.count=" + Counter1.count);
    }
}
