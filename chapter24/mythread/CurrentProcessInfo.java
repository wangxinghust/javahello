package mythread;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;

public class CurrentProcessInfo {
    public static void main(String[] args){
        // 获取当前进程的句柄
        ProcessHandle current=ProcessHandle.current();
        // 调用方法
        printInfo(current);
    }

    /**
     * 输出进程的详细信息
     * @param handle
     */
    private static void printInfo(ProcessHandle handle) {
        // 获取进程的pid
        long pid=handle.pid();
        // 如果进程仍然在运行
        boolean isAlive=handle.isAlive();
        ProcessHandle.Info info=handle.info();
        String command=info.command().orElse("");
        String[] args=info.arguments().orElse(new String[]{});
        String commandLine=info.commandLine().orElse("");
        ZonedDateTime startTime=info.startInstant().orElse(Instant.now()).atZone(ZoneId.systemDefault());
        Duration duration=info.totalCpuDuration().orElse(Duration.ZERO);
        String owner=info.user().orElse("Unknown");
        long childrenCount=handle.children().count();
        // 下面开始顺序输出进程的信息
        System.out.printf("PID: %d%n",pid);
        System.out.printf("isAlive: %b%n",isAlive);
        System.out.printf("command: %s%n",command);
        System.out.printf("args: %s%n", Arrays.toString(args));
        System.out.printf("commandLine: %s%n",commandLine);
        System.out.printf("startTime: %s%n",startTime);
        System.out.printf("duration: %s%n",duration);
        System.out.printf("owner: %s%n",owner);
        System.out.printf("childrenCount: %d%n",childrenCount);
    }
}
