package mythread;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UsingProccessBuilder {
    /**
     * 获取Windows系统下网卡的MAC地址
     *
     * @return
     */
    public static List<String> getPhysicalAddress() {
        Process p = null;
        // 物理网卡列表
        List<String> address = new ArrayList<>();
        try {
            p = new ProcessBuilder("ipconfig", "/all").start();
        } catch (IOException e) {
            return address;
        }
        byte[] b = new byte[1024];
        int readBytes = -1;
        StringBuffer sb = new StringBuffer();
        // 读取进程输出值
        // 在java I/O中，输入输出是针对JVM而言的，读写是针对外部数据源而言的
        InputStream in = p.getInputStream();
        try {
            while ((readBytes = in.read(b)) != -1) {
                sb.append(new String(b, 0, readBytes));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 以下是分析输出值得到物理网卡的过程
        String rtValue = sb.toString();
        int i = rtValue.indexOf("Physical Address. . . . . . . . . :");
        // 循环查找所有符合条件的值
        while (i > 0) {
            rtValue = rtValue.substring(i + "Physical Address. . . . . . . . . :".length());
            address.add(rtValue.substring(1, 18));
            i = rtValue.indexOf("Physical Address. . . . . . . . . :");
        }

        return address;
    }

    /**
     * 执行自定义的一个命令，该命令放在（Windows）C：/temp下，并且需要两个环境变量的支持
     * @return
     */
    public static boolean executedMyCommand1(){
        // 创建系统进程创建器
        ProcessBuilder pb=new ProcessBuilder("myCommand","myArg1","myArg2");
        // 获得进程的环境
        Map<String,String> env=pb.environment();
        // 设置和去除环境变量
        env.put("VAR1","myValue");
        env.remove("VAR0");
        env.put("VAR2",env.get("VAR1")+";");

        return false;
    }
}
