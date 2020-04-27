package mythread;

/**
 * 演示线程的死亡
 */
public class si extends Thread {
    private int i;

    @Override
    public void run() {
        for (; i < 100; i++) {
            // 当线程类继承Thread类时，可以直接调用getName方法返回当前线程名
            // 如果想要获得当前线程，则直接使用this即可。Thread对象的getName方法返回当前线程名
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        // 创建线程对象
        si sd = new si();
        for (int i = 0; i < 300; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                sd.start();
                System.out.println(sd.isAlive());
            }
            if (i > 20 && !sd.isAlive()) {
                // 试图再次启动该线程，抛出如下异常
                // Exception in thread "main" java.lang.IllegalThreadStateException
                sd.start();
            }
        }
    }
}
