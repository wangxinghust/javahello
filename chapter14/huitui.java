import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * 演示回退流的用法
 * 过滤url中的小数点
 */
public class huitui {
    public static void main(String[] args) throws IOException {
        String str = "www.zhihu.com";
        PushbackInputStream push = null;
        ByteArrayInputStream bai = null;
        bai = new ByteArrayInputStream(str.getBytes());
        push = new PushbackInputStream(bai);
        // 从内存中读取数据
        System.out.println("读取之后的数据为：");
        int temp = 0;
        while ((temp = push.read()) != -1) {
            if (temp == '.') {
                push.unread(temp);
                temp = push.read();
                System.out.print("退回" + (char) temp);
            } else {
                System.out.print((char) temp);
            }
        }
    }
}
