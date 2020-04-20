class Apple12<T extends Number> {
    T size;

    public Apple12() {
    }

    public Apple12(T size) {
        this.size = size;
    }

    public void setSize(T size) {
        this.size = size;
    }

    public T getSize() {
        return this.size;
    }
}

public class cachu {
    public static void main(String[] args) {
        Apple12<Integer> a = new Apple12<Integer>(6);
        // a的getSize()方法返回Integer对象
        Integer as = a.getSize();
        // 把a对象赋给Apple12变量，会丢失尖括号里的类型信息
        Apple12 b = a;
        // b只知道size的类型是number
        Number size1 = b.getSize();
        // 下一行代码编译错误，无法将Number转换为Integer
        //Integer size2=b.getSize();
    }
}
