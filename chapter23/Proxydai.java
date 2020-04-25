import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

/**
 * 在URLConnection中使用代理服务器
 */
public class Proxydai {
    Proxy proxy;
    URL url;
    URLConnection conn;
    // 在网络上通过代理读数据
    Scanner scan;
    PrintStream ps;
    // 下面是代理服务器的地址和端口
    // 换成实际有效的代理服务器地址和端口
    String proxyAddress = "103.14.111.218";
    int proxyPort = 3128;
    // 下面是试图打开的网站地址
    String urlStr = "http://www.xiladaili.com/";

    public void init() {
        try {
            url = new URL(urlStr);
            // 创建一个代理服务器对象
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyAddress, proxyPort));
            // 使用指定的代理服务器打开链接
            conn = url.openConnection(proxy);
            // 设置超时时长
            conn.setConnectTimeout(5000);
            scan = new Scanner(conn.getInputStream());
            // 初始化输出流
            ps = new PrintStream("Index.html");
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                // 在控制台输出网页资源内容
                System.out.println(line);
                // 将网页资源内容输出到指定输出流
                ps.println(line);
            }
        } catch (MalformedURLException e) {
            System.out.println("不是有效的网站地址");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }

    public static void main(String[] args) {
        new Proxydai().init();
    }
}
