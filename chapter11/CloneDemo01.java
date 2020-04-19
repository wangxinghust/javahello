class mm implements Cloneable {
    private String name;

    public mm(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "姓名：" + this.name;
    }

    public Object clone()
            throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneDemo01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        mm p1 = new mm("张三");
        mm p2 = (mm) p1.clone();
        p2.setName("李四");
        System.out.println("原始对象：" + p1);
        System.out.println("复制后对象：" + p2);
    }
}
