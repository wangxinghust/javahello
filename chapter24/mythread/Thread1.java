package mythread;

public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println(this.getName());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread1 thread1 = new Thread1();
        Thread1 thread2 = new Thread1();
        thread1.start();
        thread2.start();
    }
}
