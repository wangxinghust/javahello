class textone {
    // main方法不再类Leitwo1中，会引发error: can't find main(String[]) method in class: Leitwo1
    // 调整两个class的顺序后解决 重命名java文件的方法并不作用
    public static void main(String[] args) {
        Leitwo1 aa = new Leitwo1();
        aa.a = 4478;
        aa.print();
    }
}

public class Leitwo1 {
    public int a;

    public void print() {
        System.out.println("the value of a is " + a);
    }
}
