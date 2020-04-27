package mythread;

/**
 * 使用退出标志终止线程
 */
public class ThreadFlag extends Thread {
    public volatile boolean exit = false;

    public void run() {
        while (!exit) ;
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadFlag thread = new ThreadFlag();
        thread.start();
        sleep(5000);
        thread.exit = true;
        thread.join();
        System.out.println("线程退出");
    }
}
