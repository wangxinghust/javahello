public class RuntimeT2 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        try {
            run.exec("notepad.exe");
        } catch (Exception e) {
            e.printStackTrace();// 将日志信息输出到控制台
            System.out.println(e);
        }
    }
}
