public class tiao2 {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while (true) {
            i++;
            inner:
            for (int j = 0; j < 15; j++) {
                i += j;
                if (j == 3) {
                    continue inner;
                }
                break outer;
            }
            continue outer;
        }
        System.out.println(i);
    }
}