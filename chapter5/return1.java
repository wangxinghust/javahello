public class return1{
    public static void main(String[] args){
        System.out.println("-------no return value type");
        for (int i = 0; i < 100; i++) {
            if(i==4) return;
            System.out.println("i="+i);
        }
    }
}