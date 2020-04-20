interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}

public class MyClass12<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    MyClass12(T[] ob) {
        vals = ob;
    }

    @Override
    public T min() {
        T val = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(val) < 0) {
                val = vals[i];
            }
        }
        return val;
    }

    @Override
    public T max() {
        T val = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(val) > 0) {
                val = vals[i];
            }
        }
        return val;
    }
}
