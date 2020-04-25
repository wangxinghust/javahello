import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * 访问HTTP2网址
 */
public class http2 {
    public static void http2() throws Exception {
        HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.NORMAL)
                .version(HttpClient.Version.HTTP_2)
                .build()
                .sendAsync(HttpRequest.newBuilder().uri(new URI("http://www.ptpress.com.cn")).GET().build(),
                        HttpResponse.BodyHandlers.ofString())
                .whenComplete((resp, t) -> {
                    if (t != null) {
                        t.printStackTrace();
                    } else {
                        System.out.println(resp.body());
                        System.out.println(resp.statusCode());
                    }
                }).join();
    }

    public static void main(String[] args) throws Exception {
        http2();
    }
}
