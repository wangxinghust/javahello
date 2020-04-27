package mythread;

import org.jetbrains.annotations.NotNull;

/**
 * 使用类Thread设置线程名
 */
public class Thread2 extends Thread {
    private String who;

    @Override
    public void run() {
        System.out.println(who + ":" + this.getName());
    }

    public Thread2(String who) {
        super();
        this.who = who;
    }

    public Thread2(@NotNull String name, String who) {
        super(name);
        this.who = who;
    }

    public static void main(String[] args) {
        Thread2 thread1 = new Thread2("MyThread1", "thread1");
        Thread2 thread2 = new Thread2("thread2");
        Thread2 thread3 = new Thread2("thread3");
        thread2.setName("MyThread2");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
