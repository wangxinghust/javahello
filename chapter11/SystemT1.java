public class SystemT1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 300000000; i++) {
            sum += 1;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
