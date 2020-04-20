import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask {
    @Override
    public void run() {
        SimpleDateFormat sdf = null;
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("当前系统时间为：" + sdf.format(new Date()));
    }
}

public class TestTask {
    public static void main(String[] args) {
        Timer t = new Timer();
        MyTask mytask = new MyTask();
        t.schedule(mytask, 1000, 2000);
    }
}
