/**
 * 通过InputStream实现多线程下载
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.net.URLConnection;

/**
 * 定义下载内容从start到end的线程
 */
class DownThread extends Thread {
    // 定义字节数组的长度
    private final int BUFF_LEN = 32;
    // 定义下载的起点
    private long kaishi;
    // 定义下载的结束点
    private long jieshu;
    // 下载资源对应的输入流
    private InputStream is;
    // 将下载得到的字节流输出到mm中
    private RandomAccessFile mm;

    public DownThread(long kaishi, long jieshu, InputStream is, RandomAccessFile mm) {
        // 输出该线程负责下载的字节位置
        System.out.println(kaishi + "---->" + jieshu);
        this.kaishi = kaishi;
        this.jieshu = jieshu;
        this.is = is;
        this.mm = mm;
    }

    public void run() {
        try {
            is.skip(kaishi);
            mm.seek(kaishi);
            // 定义读取输入流内容的缓存数组
            byte[] buff = new byte[BUFF_LEN];
            // 本线程负责下载资源的大小
            long contentLen = jieshu - kaishi;
            // 定义最多需要读取几次就可以完成本线程的下载
            long times = contentLen / BUFF_LEN + 4;
            // 实际读取的字节数
            int hasRead = 0;
            for (int i = 0; i < times; i++) {
                hasRead = is.read(buff);
                // 如果读取的字节数小于0，则退出循环
                if (hasRead < 0) {
                    break;
                }
                mm.write(buff, 0, hasRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
                if (mm != null) {
                    mm.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

public class xiazai {
    public static void main(String[] args) {
        final int DOWN_THREAD_NUM = 4;
        final String OUT_FILE_NAME = "down.jpg";
        InputStream[] isArr = new InputStream[DOWN_THREAD_NUM];
        RandomAccessFile[] outArr = new RandomAccessFile[DOWN_THREAD_NUM];
        try {
            // 创建一个URL对象
            // http://t9.baidu.com/it/u=1307125826,3433407105&fm=79&app=86&f=JPEG?w=5760&h=3240
            URL url = new URL("http://t9.baidu.com/it/" + "u=1307125826,3433407105&fm=79&app=86&f=JPEG?w=5760&h=3240");
            // 利用此URL对象打开第一个输入流
            isArr[0] = url.openStream();
            long fileLen = getFileLength(url);
            System.out.println("网络资源的大小：" + fileLen);
            // 利用输出文件名创建第一个RandomAccessFile输出流
            outArr[0] = new RandomAccessFile(OUT_FILE_NAME, "rw");
            // 创建一个与下载资源相同大小的空文件
            for (int i = 0; i < fileLen; i++) {
                outArr[0].write(0);
            }
            // 每个线程应该下载的字节数
            long numPerThread = fileLen / DOWN_THREAD_NUM;
            // 整个下载资源整除后剩下的余数
            long left = fileLen % DOWN_THREAD_NUM;
            for (int i = 0; i < DOWN_THREAD_NUM; i++) {
                // 为每个线程打开一个输入流、一个RandomAccessFile对象
                // 让每个线程分别负责下载资源的不同部分
                if (i != 0) {
                    // 利用URL打开多个输入流
                    isArr[i] = url.openStream();
                    // 利用指定的输出文件创建多个RandomAccessFile对象
                    outArr[i] = new RandomAccessFile(OUT_FILE_NAME, "rw");
                    //分别启动多个线程来下载网络资源

                }
                if (i == DOWN_THREAD_NUM - 1) {
                    // 最后一个线程下载指定numPerThread+left个字节
                    new DownThread(i * numPerThread, (i + 1) * numPerThread + left, isArr[i], outArr[i]).start();
                } else {
                    // 每个线程负责下载numPerThread个字节
                    new DownThread(i * numPerThread, (i + 1) * numPerThread, isArr[i], outArr[i]).start();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 定义获取指定网络资源长度的方法
     *
     * @param url
     * @return
     */
    private static long getFileLength(URL url) throws IOException {
        // 打开该URL对应的URLConnection
        URLConnection con = url.openConnection();
        // 获取连接URL资源的长度
        long length = con.getContentLength();
        return length;
    }
}
