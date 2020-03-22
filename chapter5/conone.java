public class conone{
    public static void main(String[] args){
        for (int a = 0; a < 10; a++) {
            System.out.println(a);
            if(a%2==0){
                continue;
            }
            System.out.println("$");
        }
    }
}