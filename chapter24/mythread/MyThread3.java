package mythread;

/**
 * 通过回调函数传递数据
 */

class Data {
    public int value = 0;
}

class Work {
    /**
     * 回调函数
     *
     * @param data
     * @param numbers
     */
    public void process(Data data, int[] numbers) {
        for (int n :
                numbers) {
            data.value += n;
        }
    }
}

public class MyThread3 extends Thread {
    private Work work;

    public MyThread3(Work work) {
        this.work = work;
    }

    @Override
    public void run() {
        java.util.Random random = new java.util.Random();
        Data data = new Data();
        int n1 = random.nextInt(1000);
        int n2 = random.nextInt(2000);
        int n3 = random.nextInt(3000);
        int numbers[] = new int[]{n1, n2, n3};
        work.process(data, numbers);
        System.out.println(String.valueOf(n1) + "+" + String.valueOf(n2) + "+" + String.valueOf(n3) + "=" + data.value);
    }

    public static void main(String[] args) {
        Thread thread = new MyThread3(new Work());
        thread.start();
    }
}
