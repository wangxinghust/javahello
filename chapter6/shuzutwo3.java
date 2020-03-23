public class shuzutwo3{
    public static void main(String[] args){
        int[][] a={{12,32},{10,34},{18,36}};
        int max=a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
        }
        System.out.println("the max value of this two dimensional array is "+max);
    }
}