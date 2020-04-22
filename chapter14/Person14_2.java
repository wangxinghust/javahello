import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * 修改Person14类并实现Externalizable接口
 */
public class Person14_2 implements Externalizable {
    private String name;
    private int age;

    public Person14_2() {
    }

    public Person14_2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名：" + this.name + "；年龄：" + this.age;
    }

    /**
     * 根据需要保存属性或具体内容，序列化时使用
     *
     * @param out
     * @throws IOException
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.name);
        out.writeObject(this.age);
    }

    /**
     * 根据需要读取内容，反序列化时使用
     *
     * @param in
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = (String) in.readObject();
        this.age = in.readInt();
    }
}
