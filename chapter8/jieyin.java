interface diyijie {
    int add(int a, int b);
}

interface dierjie {
    int sub(int a, int b);
}

interface disanjie {
    int mul(int a, int b);
}

interface disijie {
    int umul(int a, int b);
}

class jiekouniu implements diyijie, dierjie, disanjie, disijie {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int umul(int a, int b) {
        return a / b;
    }
}

/**
 * 编写测试类
 */
public class jieyin {
    public static void main(String[] args) {
        jiekouniu aa = new jiekouniu();
        // 接口引用赋值
        diyijie bb = aa;
        dierjie cc = aa;
        disanjie dd = aa;
        disijie ee = aa;
        System.out.println("a+b=" + aa.add(14, 22));
        System.out.println("a-b=" + aa.sub(14, 22));
        System.out.println("a*b=" + aa.mul(14, 22));
        System.out.println("a/b=" + aa.umul(14, 22));
        System.out.println("a+b=" + bb.add(14, 22));
        System.out.println("a-b=" + cc.sub(14, 22));
        System.out.println("a*b=" + dd.mul(14, 22));
        System.out.println("a/b=" + ee.umul(14, 22));
    }
}
