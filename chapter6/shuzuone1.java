public class shuzuone1{
    public static void main(String[] args){
        int[] x={12,13,24,77,68,39,60};
        int[] y;
        y=x;
        for (int i = 0; i < x.length; i++) {
            y[i]++;
            System.out.println("x["+i+"]="+x[i]);
            System.out.println("y["+i+"]="+y[i]);
        }
    }
}