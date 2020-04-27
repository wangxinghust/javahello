package mythread;

import java.io.IOException;

/**
 * 在线程处于阻塞状态时使用interrupt()方法
 */
public class ThreadInterrupt extends Thread {
    @Override
    public void run() {
        try {
            // 延迟50s
            sleep(50000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Thread thread = new ThreadInterrupt();
        thread.start();
        System.out.println("在50s之内按任意键中断线程");
        System.in.read();
        thread.interrupt();
        thread.join();
        System.out.println("线程已经退出");
    }
}
