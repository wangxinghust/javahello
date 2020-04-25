import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Properties;
import java.util.Scanner;

/**
 * 通过改变系统属性来改变默认的代理服务器
 */
public class ProxySelectoryong {
    // 测试本地JVM的网络默认配置
    public void setLocalProxy() {
        Properties prop = System.getProperties();
        // 设置HTTP访问要使用的代理服务器地址
        prop.setProperty("http.proxyHost", "192.168.0.96");
        // 设置HTTP访问要使用的代理服务器端口
        prop.setProperty("http.proxyPort", "8080");
        // 设置HTTP不需要通过代理服务器访问的主机
        // 可以用*通配符，多个地址用|分隔
        prop.setProperty("http.nonProxyHosts", "localhost|10.20.*");
        // 设置安全HTTP访问使用的代理服务器地址与端口
        // 它没有https.nonProxyHosts属性，它按照http.nonProxyHosts中设置的规则进行访问
        prop.setProperty("https.proxyHost", "10.10.0.96");
        prop.setProperty("https.proxyPort", "443");
        // 设置fpt访问的代理服务器主机、端口以及不需要使用代理服务器的主机
        prop.setProperty("ftp.proxyHost", "10.10.0.96");
        prop.setProperty("ftp.proxyPort", "2121");
        prop.setProperty("ftp.nonProxyHosts", "localhost|10.10.*");
        // 设置socks代理服务器的地址和端口
        prop.setProperty("socksProxyHost ", "10.10.0.96");
        prop.setProperty("socksProxyPort", "1080");
    }

    // 清除proxy设置
    public void removeLocalProxy() {
        Properties prop = System.getProperties();
        // 清除HTTP访问的代理服务器设置
        prop.remove("http.proxyHost");
        prop.remove("http.proxyPort");
        prop.remove("http.nonProxyHosts");
        // 清除HTTPS访问的代理服务器设置
        prop.remove("https.proxyHost");
        prop.remove("https.proxyPort");
        // 清除FTP访问的代理服务器设置
        prop.remove("ftp.proxyHost");
        prop.remove("ftp.proxyPort");
        prop.remove("ftp.nonProxyHosts");
        // 清除socks的代理服务器设置
        prop.remove("socksProxyHost");
        prop.remove("socksProxyPort");
    }

    // 测试HTTP访问
    public void showHttpProxy() throws IOException {
        URL url = new URL("http://www.163.com");
        URLConnection conn = url.openConnection();
        Scanner scan = new Scanner(conn.getInputStream());
        // 读取远程主机的内容
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }

    public static void main(String[] args) throws IOException {
        ProxySelectoryong test = new ProxySelectoryong();
        test.setLocalProxy();
        test.showHttpProxy();
        test.removeLocalProxy();
    }
}
