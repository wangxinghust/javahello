import java.util.HashSet;

/**
 * 类A的equsls()方法总是返回true，但未重写hashCode()方法
 */
class A {
    public boolean equals(Object obj) {
        return true;
    }
}

/**
 * 类B的hashCode()方法总是返回1，但没有重写其equals()方法
 */
class B {
    public int hashCode() {
        return 1;
    }
}

class C {
    public int hashCode() {
        return 2;
    }

    public boolean equals(Object obj) {
        return true;
    }
}

public class yongHashSet {
    public static void main(String[] args) {
        HashSet<Object> books = new HashSet<Object>();
        // equals()方法返回true，但hashCode()方法返回值不同，会存储在不同位置
        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        // equals()方法返回ture，且hashCode()计算值一样，当做同一个对象处理
        books.add(new C());
        books.add(new C());
        System.out.println(books);
    }
}
