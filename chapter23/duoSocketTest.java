import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

/**
 * 该类实现Runnable接口，该类的实例可作为线程的target
 */
public class duoSocketTest implements Runnable {
    // 使用常量作为本程序多点广播的IP地址
    private static final String IP = "230.0.0.1";
    // 使用常量作为本程序多点广播的目标端口
    public static final int PORT = 30000;
    // 定义每个数据报的最大长度为4KB
    private static final int LEN = 4096;
    // 定义本程序的MulticastSocket实例
    private MulticastSocket socket = null;
    private InetAddress bAddress = null;
    private Scanner scan = null;
    // 定义接收网络数据的字节数据
    byte[] inBuff = new byte[LEN];
    // 用指定字节数组创建接收数据的DatagramPacket对象
    private DatagramPacket inPacket = new DatagramPacket(inBuff, inBuff.length);
    // 定义一个用于发送数据的DatagramPacket对象
    private DatagramPacket outPacket = null;

    public void init() throws IOException {
        try {
            // 创建用于发送、接收数据的MulticastSocket对象
            // 因为该MulticastSocket对象需要接收，所以应有指定端口
            socket = new MulticastSocket(PORT);
            bAddress = InetAddress.getByName(IP);
            // 将该socket加入到指定的多点广播地址
            socket.joinGroup(bAddress);
            // 设置这个MulticastSocket发送的数据报会回送到自身
            socket.setLoopbackMode(false);
            // 初始化发送用的DatagramSocket，它包含一个长度为0的字节数组
            outPacket = new DatagramPacket(new byte[0], 0, bAddress, PORT);
            // 启动以run()方法作为线程体的线程
            new Thread(this).start();
            // 创建键盘输入流
            scan = new Scanner(System.in);
            // 不断读取键盘输入
            while (scan.hasNextLine()) {
                // 将键盘输入的一行字符串转换成字节数组
                byte[] buff = scan.nextLine().getBytes();
                // 设置发送组的DatagramSocket里的字节数据
                outPacket.setData(buff);
                // 发送数据
                socket.send(outPacket);
            }
        } finally {
            socket.close();
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                // 读取Socket中的数据，读到的数据放在inPacket所封装的字节数组里
                socket.receive(inPacket);
                // 输出从Socket中读取的内容
                System.out.println("聊天信息：" + new String(inBuff, 0, inPacket.getLength()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            try {
                if (socket != null) {
                    // 设置该Socket离开该多点IP广播地址
                    socket.leaveGroup(bAddress);
                    // 关闭该Socket对象
                    socket.close();
                }
                System.exit(1);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new duoSocketTest().init();
    }
}
