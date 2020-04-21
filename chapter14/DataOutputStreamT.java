import java.io.*;

/**
 * 将订单数据写入到文件order.txt中
 */
public class DataOutputStreamT {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = null;
        File f = new File("chapter14" + File.separator + "order.txt");
        dos = new DataOutputStream(new FileOutputStream(f));
        String names[] = {"帽子", "衬衣", "裤子"};
        float prices[] = {98.3f, 30.3f, 50.5f};
        int nums[] = {3, 2, 1};
        for (int i = 0; i < names.length; i++) {
            // Each character is written to the data output stream as if by the writeChar method. 因而乱码
            dos.writeChars(names[i]);
            dos.writeChar('\t');
            dos.writeFloat(prices[i]);
            dos.writeChar('\t');
            dos.writeInt(nums[i]);
            dos.writeChar('\n');
        }
        dos.close();
    }
}
