package mythread;

/**
 * 通过方法setName()设置name变量
 * 如果继承Thread的话，自带不可覆写的setName方法
 */
public class MyThread2 implements Runnable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println("hello " + name);
    }

    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
        myThread.setName("world");
        Thread thread = new Thread(myThread);
        thread.start();
    }
}
