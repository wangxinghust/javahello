public class exercise7 {
    public static void main(String[] args) {
        // i值表示行号
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8 - i - 1; j++) {
                System.out.print(" \t");
            }
            // k定义要打印的值
            int k = 1;
            // j定义要打印的次数
            for (int j = 0; j < i + 1; j++) {
                System.out.print(k + "\t");
                k *= 2;
            }
            k /= 4;//恢复待输出的值
            // 打印右半边值
            while (k >= 1) {

                System.out.print(k + "\t");
                k /= 2;
            }
            System.out.print("\n");
        }
    }
}
