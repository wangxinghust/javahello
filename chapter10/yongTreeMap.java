import java.util.TreeMap;

class RR implements Comparable {
    int count;

    public RR(int count) {
        this.count = count;
    }

    public String toString() {
        return "RR(count:" + count + ")";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == RR.class) {
            RR r = (RR) obj;
            if (r.count == this.count) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Object obj) {
        RR r = (RR) obj;
        if (this.count > r.count) {
            return 1;
        } else if (this.count == r.count) {
            return 0;
        } else {
            return -1;
        }
    }
}

public class yongTreeMap {
    public static void main(String[] args) {
        TreeMap<RR, String> tm = new TreeMap<RR, String>();
        tm.put(new RR(3), "android");
        tm.put(new RR(-5), "ios");
        tm.put(new RR(9), "ubuntu");
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());
        System.out.println(tm.higherEntry(new RR(2)));
        System.out.println(tm.lowerEntry(new RR(2)));
        System.out.println(tm.subMap(new RR(-1), new RR(4)));
    }
}
