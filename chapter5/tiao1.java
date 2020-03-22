public class tiao1{
    final static int a=10;
    public static void main(String[] args){
        for (int b = 0; b < a; b++) {
            System.out.println(b);
            if(b>5){
                //break;
                continue;
            }
            System.out.println(b);
        }
    }
}