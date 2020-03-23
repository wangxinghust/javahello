public class shuzugong1{
    public static void main(String[] args){
        int x;
        int[] y={10,9,8,7,6,5,4,3,2,1};
        System.arraycopy(y,0,y,0,y.length);
        for(x=0;x<y.length;x++){
            System.out.print(y[x]+" ");
        }
        System.out.println();
    }
}