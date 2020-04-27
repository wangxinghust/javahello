package mythread;

/**
 * 演示join()方法的基本用法
 */
public class JoinThread extends Thread {
    public static volatile int n = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++, n++) {
            try {
                // 延迟3ms
                sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread threads[] = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new JoinThread();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        // 加上参数和不加参数后输出结果有较大差别，但仍不能输出1000
        // 递增运算不是原子操作
        if (args.length > 0) {
            for (int i = 0; i < threads.length; i++) {
                threads[i].join();
            }
        }
        System.out.println("n=" + JoinThread.n);
    }
}
