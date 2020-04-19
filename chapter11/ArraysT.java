import java.util.Arrays;

public class ArraysT {
    public static void main(String[] args) {
        int temp[] = {3, 4, 5, 7, 9, 1, 2, 6, 8};
        Arrays.sort(temp);
        System.out.println(temp);
        System.out.println("排序后的数组：" + Arrays.toString(temp));
        int point = Arrays.binarySearch(temp, 3);
        System.out.println("元素’3‘的位置：" + point);
        Arrays.fill(temp, 3);
        System.out.println("数组填充：" + Arrays.toString(temp));
    }
}
