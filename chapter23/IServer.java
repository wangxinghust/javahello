import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * 开发一个聊天室程序1
 * 服务端
 */
public class IServer {
    // 定义保存所有Socket的ArrayList
    public static ArrayList<Socket> socketList = new ArrayList<Socket>();

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(30000);
            while (true) {
                // 此行代码会阻塞，它将一直等待其他的连接
                Socket s = ss.accept();
                socketList.add(s);
                // 当客户端连接后启动一条ServerThread线程为该客户端进行服务
                new Thread(new Serverxian(s)).start();
                //ss.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
