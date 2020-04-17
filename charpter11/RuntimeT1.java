public class RuntimeT1 {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        System.out.println("max memory of JVM: " + run.maxMemory());
        System.out.println("free memory of JVM: " + run.freeMemory());
        String str = "Hello " + "World" + "!" + "\t" + "Welcome " + "to " + "Beijing" + "~";
        System.out.println(str);
        for (int i = 0; i < 1000; i++) {
            str += i;
        }
        System.out.println("after string operation: " + run.freeMemory());
        run.gc();
        System.out.println("after gc: " + run.freeMemory());
    }
}
