import java.util.Arrays;
public class shuzugong5{
    public static void main(String[] args){
        int[] a={6,2,5,4,6,2,3};
        Arrays.sort(a);
        System.out.print("the sorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(+a[i]+" ");
        }
        System.out.println();
        int location=Arrays.binarySearch(a,4);
        System.out.println("the location of 4 for the array is "+location+",a["+location+"]="+a[location]);
    }
}