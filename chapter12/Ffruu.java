/**
 * 设置类型形参上限
 *
 * @param <T>
 */
public class Ffruu<T extends Number> {
    T col;

    public static void main(String[] args) {
        Ffruu<Integer> a1 = new Ffruu<>();
        Ffruu<Double> a2 = new Ffruu<>();
        // 下行代码编译异常
        //Ffruu<String> a3=new Ffruu<String>();
    }
}
