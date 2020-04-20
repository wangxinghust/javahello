/**
 * javap反编译查看泛型
 * 结果与反编译工具有关，理论上泛型信息会被擦除
 */
public class Gen<T extends String> {
    public T getOb() {
        return ob;
    }

    public Gen(T ob) {
        this.ob = ob;
    }

    T ob;
}
