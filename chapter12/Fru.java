/**
 * 带泛型声明的类
 *
 * @param <T>
 */
public class Fru<T> {
    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    private T info;

    public Fru(T info) {
        this.info = info;
    }

    public static void main(String[] args) {
        Fru<String> a1 = new Fru<String>("水果");
        System.out.println(a1.getInfo());
        // 已声明，可以省略定义里的类型形参
        Fru<Double> a2 = new Fru<>(5.8);
        System.out.println(a2.getInfo());
    }
}
