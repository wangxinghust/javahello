package mythread;

import java.util.concurrent.CountDownLatch;

/**
 * 使用关键字synchronized实现原子性操作
 */
public class Counter4 {
    public volatile static int count = 0;
    static CountDownLatch cdLatch = new CountDownLatch(1000);

    public static void inc() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (Counter4.class) {
            count++;
        }
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                CountDownLatch countDownLatch = Counter4.cdLatch;

                @Override
                public void run() {
                    Counter4.inc();
                    countDownLatch.countDown();
                }
            }).start();
        }

        try {
            cdLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("运行结果：Counter4.count=" + Counter4.count);
        System.out.println(System.currentTimeMillis());
    }
}
