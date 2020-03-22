public class dothree {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 120);
        System.out.println(sum);
    }
}