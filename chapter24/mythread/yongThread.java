package mythread;

/**
 * 使用Thread创建线程
 * 通过继承Thread类来创建线程类
 */
public class yongThread extends Thread {
    @Override
    public void run() {
        for (int j = 0; j < 100; j++) {
            // 当线程类继承Thread类时，可以直接调用getName()方法来返回当前线程名
            // 如果想获取当前线程，则直接使用this即可
            // Thread对象的getName返回当前线程名
            System.out.println(getName() + " " + j);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            // 调用Thread类的currentThread方法获取当前线程
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                new yongThread().start();
                new yongThread().start();
            }
        }
    }
}
