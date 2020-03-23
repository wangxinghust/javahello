import java.util.Random;
public class shuzuone3{
    public static void main(String[] args){
        Random rand=new Random();
        int[] x=new int[rand.nextInt(5)];
        double[] y=new double[rand.nextInt(5)];
        System.out.println("the length of x is "+x.length);
        System.out.println("the length of y is "+y.length);
        for (int i = 0; i < x.length; i++) {
            x[i]=rand.nextInt(5);
            System.out.println("x["+i+"]="+x[i]);
        }
        for (int i = 0; i < y.length; i++) {
            y[i]=rand.nextDouble();
            System.out.println("y["+i+"]="+y[i]);
        }
    }
}
