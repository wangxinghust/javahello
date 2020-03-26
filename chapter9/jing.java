class gen {
    // 静态初始化块
    static {
        System.out.println("gen static initialization block");
    }

    {
        System.out.println("gen general initialization block");
    }

    public gen() {
        System.out.println("gen no parameter constructor");
    }
}

class zhong extends gen {
    static {
        System.out.println("zhong static initialization block");
    }

    {
        System.out.println("zhong general initialization block");
    }

    public zhong() {
        System.out.println("zhong no parameter constructor");
    }

    public zhong(String msg) {
        this();
        System.out.println("zhong with parameter constructor, is: " + msg);
    }
}

class xiao extends zhong {
    static {
        System.out.println("xiao static initialization block");
    }

    {
        System.out.println("xiao general initialization block");
    }

    public xiao() {
        super("AAAA");
        System.out.println("execute xiao constructor");
    }
}

public class jing {
    public static void main(String[] args) {
        new xiao();
        System.out.println();
        // 第二次创建对象，静态初始块不再执行
        new xiao();
    }
}
