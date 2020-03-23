public class shuzutwo1 {
    public static void main(String[] args){
        int [][] a={
                {11,12,23,23},
                {15,26,27,18},
                {19,10,17,18},
                {13,14,15,16},
                {17,18,19,20},
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a["+i+"]["+j+"]="+a[i][j]);
            }
        }
    }
}