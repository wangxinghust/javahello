package mythread;

/**
 * 演示Java的自动转换
 */
public class houtai extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        houtai t = new houtai();
        // 设置为后台线程
        t.setDaemon(true);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        // 线程执行到此处结束，前台线程(main线程)结束，后台线程随之结束
    }
}
