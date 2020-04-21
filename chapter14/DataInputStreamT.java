import java.io.*;

/**
 * 读取文件order.txt中的订单数据
 */
public class DataInputStreamT {
    public static void main(String[] args) throws FileNotFoundException {
        DataInputStream dis = null;
        File f = new File("chapter14" + File.separator + "order.txt");
        dis = new DataInputStream(new FileInputStream(f));
        String name = null;
        float price = 0.0f;
        int num = 0;
        char temp[] = null;
        int len = 0;
        char c = 0;
        try {
            // 读完文件时会readChar()会抛异常EOFException
            while (true) {
                temp = new char[200];
                len = 0;
                while ((c = dis.readChar()) != '\t') {
                    // 接收内容
                    temp[len] = c;
                    len++; // 读取长度++
                }
                name = new String(temp, 0, len);
                price = dis.readFloat();
                dis.readChar();
                num = dis.readInt();
                dis.readChar();
                System.out.printf("名称：%s；价格：%5.2f；数量：%d\n", name, price, num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
