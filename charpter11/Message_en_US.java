import java.util.ListResourceBundle;

/**
 * 默认英文环境的话，InterT1里需要价格Message文件命令为Message_en_US，或者Message，
 * Java中可以使用属性文件来保存所有的资源信息，也可以使用类来保存，在开发中少见
 */
public class Message_en_US extends ListResourceBundle {
    private final Object data[][] = {
            {"info", "English，hello，{0}！"}
    };

    @Override
    protected Object[][] getContents() {
        return data;
    }
}
