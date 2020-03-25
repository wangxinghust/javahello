class Cguize {
    String sname;
    int sid;
    int snumber;

    public void print() {
        System.out.println("name: " + sname + "\tserial number:" + sid + "\tpeople counting: " + snumber);
    }

    Cguize(String name, int id, int number) {
        sname = name;
        sid = id;
        snumber = number;
    }
}

class CguizeOne extends Cguize {
    String sadder;

    CguizeOne(String x, int y, int z, String aa) {
        super(x, y, z);
        sadder = aa;
    }

    // 编译报错，需要修改private为public
    //private void print(){
    public void print() {
        System.out.println("name: " + sname + "\tserial number:" + sid + "\tpeople counting: " + snumber);
    }
}

public class texttwo {
    public static void main(String[] args) {
        CguizeOne a1 = new CguizeOne("chongqing", 72221, 7001, "yunan");
        a1.print();
    }
}
