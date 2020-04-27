package mythread;

/**
 * 使用onSpinWait()方法
 */
public class HelloJDK9 {
    volatile boolean eventNotificationNotReceived = true;

    public void setEventNotificationNotReceived(boolean eventNotificationNotReceived) {
        this.eventNotificationNotReceived = eventNotificationNotReceived;
    }

    public static void main(String[] args) {
        HelloJDK9 helloJDK9 = new HelloJDK9();
        new Thread() {
            @Override
            public void run() {
                System.out.println("线程一开始等待线程二的指令");
                int num = 0;
                while (helloJDK9.eventNotificationNotReceived) {
                    num++;
                    Thread.onSpinWait();
                }
                System.out.println("线程一收到线程二的指令,num=" + num);
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("线程二等待1s");
                    sleep(1000);
                    helloJDK9.setEventNotificationNotReceived(false);
                    System.out.println("线程二发出指令");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
