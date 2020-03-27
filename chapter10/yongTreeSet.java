import java.util.TreeSet;

class Z implements Comparable<Object> {
    int age;

    public Z(int age) {
        this.age = age;
    }

    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}

public class yongTreeSet {
    public static void main(String[] args) {
        TreeSet<Z> set = new TreeSet<Z>();
        Z z1 = new Z(6);
        set.add(z1);
        System.out.println(set.add(z1));
        System.out.println(set);
        // 需要转换类型
        ((Z) (set.first())).age = 9;
        System.out.println(((Z) (set.last())).age);
    }
}
