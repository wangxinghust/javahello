import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 复制文件a.txt中的内容并追加在该文件后面
 */
public class fuzhui {
    public static void main(String[] args) {
        FileChannel randomChannel = null;
        try {
            File f = new File("a.txt");
            RandomAccessFile raf = new RandomAccessFile(f, "rw");
            // 获取RandomAccessFile对应的Channel
            randomChannel = raf.getChannel();
            ByteBuffer buffer = randomChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
            // 将Channel的记录指针移动到最后
            randomChannel.position(f.length());
            randomChannel.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
