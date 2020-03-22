public class breakyou{
    public static void main(String [] args){
        out:for (int x = 0; x < 10; x++) {
            System.out.println("x="+x);
            for (int y = 0; y < 10; y++) {
                if(y==7){
                    break out;
                }
                System.out.println("y="+y);
            }
        }
    }
}