public class tuoniao extends feiniao {
    /**
     * 重写fly()方法
     */
    public void fly() {
        System.out.println("I can only run");
    }

    /**
     * 在子类中显示调用父类被覆盖的方法
     */
    public void callOverrideMethod() {
        super.fly();
    }

    public static void main(String[] args) {
        tuoniao os = new tuoniao();
        os.fly();
        os.callOverrideMethod();
    }
}
