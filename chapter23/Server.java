import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建TCP的服务器端
 */
public class Server {
    public static void main(String[] args) throws IOException {
        // 创建一个ServerSocket，以监听客户端Socket上的连接请求
        ServerSocket ss = new ServerSocket(30000);
        // 采用循环方式不断接收来自客户端的请求
        while (true) {
            // 每当连接到客户端Socket的请求后，服务器端也对应产生一个Socket
            Socket s = ss.accept();
            // 将Socket对应的输出流包装成PrintStream流
            PrintStream ps = new PrintStream(s.getOutputStream());
            // 进行普通的I/O操作，输出文本
            ps.println("圣诞快乐");
            // 关闭输出流，关闭Socket
            ps.close();
            s.close();
            ss.close();
        }
    }
}
