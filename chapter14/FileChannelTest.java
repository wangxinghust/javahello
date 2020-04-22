import java.io.*;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * 将FileChannel中的全部数据映射成ByteBuffer
 */
public class FileChannelTest {
    public static void main(String[] args) {
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            File f = new File("chapter14" + File.separator + "FileChannelTest.java");
            inChannel = new FileInputStream(f).getChannel();
            MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
            // 使用GBK字符集来创建解码器
            Charset charset = Charset.forName("utf-8");
            // 以文件流形式创建FileBuffer，用来控制输出
            outChannel = new FileOutputStream("a.txt").getChannel();
            // 直接输出buffer里的全部数据
            outChannel.write(buffer);
            // 再次调用buffer的clear()方法，复原limit、position的值
            buffer.clear();
            // 创建解码器(CharsetDecoder)对象
            CharsetDecoder decoder = charset.newDecoder();
            // 使用解码器将ByteBuffer转换成CharBuffer
            CharBuffer charBuffer = decoder.decode(buffer);// 抛异常，修改编码格式后解决
            // CharBuffer的toString方法可以获取对应的字符串
            System.out.println(charBuffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inChannel != null) {
                    inChannel.close();
                }
                if (outChannel != null) {
                    outChannel.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
