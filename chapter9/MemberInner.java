public class MemberInner {
    private int a = 1;

    public void execute() {
        InnerClass innerClass = this.new InnerClass();
    }

    /**
     * 成员内部类
     */
    public class InnerClass {
        private int a = 2;

        public void execute() {
            System.out.println(this.a);
            // 在内部类中使用外部类成员变量的方法
            System.out.println(MemberInner.this.a);
        }
    }

    public static void main(String[] args) {
        MemberInner.InnerClass innerClass = new MemberInner().new InnerClass();
        innerClass.execute();
    }
}
