package mythread;

/**
 * count不是原子级别的
 */
public class Counter {
    public static int count = 0;

    public static void inc() {
        // 这里延迟1ms，使结果更明显
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    public static void main(String[] args) {
        // 同时启动100个线程，去进行i++计算
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Counter.inc();
                }
            }).start();
        }
        // 这里每次的运行结果都可能不同
        System.out.println("运行结果：Counter.count=" + Counter.count);
    }
}
