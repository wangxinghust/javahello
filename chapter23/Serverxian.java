import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * 开发一个聊天室程序2
 * 负责每个线程通信的线程类
 */
public class Serverxian implements Runnable {
    // 定义当前线程所处理的Socket
    Socket s = null;
    // 该线程所处理的Socket所对应的输入流
    BufferedReader br = null;

    public Serverxian(Socket s) throws IOException {
        this.s = s;
        // 初始化该Socket对应的输入流
        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }

    @Override
    public void run() {
        try {
            String content = null;
            // 采用循环方式不断地从Socket中读取客户端发送来的数据
            while ((content = readFromClient()) != null) {
                // 遍历socketList中的每个Socket
                // 将读取到的内容向每个Socket发送一次
                for (Socket s : IServer.socketList) {
                    PrintStream ps = new PrintStream(s.getOutputStream());
                    ps.println(content);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 定义读取客户端数据的方法
     *
     * @return
     */
    private String readFromClient() {
        try {
            return br.readLine();
        } catch (IOException e) { // 如果捕捉到异常，则表明该Socket对应的客户端已经关闭
            // 删除该Socket
            IServer.socketList.remove(s);
        }
        return null;
    }
}
