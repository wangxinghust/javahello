package mythread;

/**
 * 创建、运行和停止线程
 */
public class LifeCycle extends Thread {
    public void run() {
        int n = 0;
        while ((++n) < 1000) ;
    }

    public static void main(String[] args) throws InterruptedException {
        LifeCycle thread1 = new LifeCycle();
        System.out.println("isAlive: " + thread1.isAlive());
        thread1.start();
        System.out.println("isAlive: " + thread1.isAlive());
        thread1.join();
        System.out.println("thread1已经结束！");
        System.out.println("isAlive: " + thread1.isAlive());
    }
}
