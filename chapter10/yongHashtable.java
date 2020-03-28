import java.util.Hashtable;

class AAA {
    int count;

    public AAA(int count) {
        this.count = count;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == AAA.class) {
            AAA a = (AAA) obj;
            if (this.count == a.count) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.count;
    }
}

class BBB {
    public boolean equals(Object obj) {
        return true;
    }
}

public class yongHashtable {
    public static void main(String[] args) {
        Hashtable<AAA, Object> ht = new Hashtable<AAA, Object>();
        ht.put(new AAA(60000), "android");
        ht.put(new AAA(87563), "ios");
        ht.put(new AAA(1232), new BBB());
        System.out.println(ht);
        // 因为Hashtable中有一个BBB对象，它通过equals方法比较返回true，所以下面输出true
        System.out.println(ht.containsValue("test"));
        // 因为两个AAA对象的count属性相等，通过equals方法比较返回true，且hashCode相等
        // Hashtable即认为它们是相同的key，所以下面输出true
        System.out.println(ht.containsKey(new AAA(87563)));
        ht.remove(new AAA(1232));
        for (Object key : ht.keySet()) {
            System.out.print(key + "---->");
            System.out.print(ht.get(key) + "\n");
        }
    }
}
