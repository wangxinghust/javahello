public class MyYiT {
    public static void firstException() throws MyYi {
        throw new MyYi("\"firstException()\" method occurs an exception!");
    }

    public static void secondException() throws MyYi {
        throw new MyYi("\"secondException()\" method occurs an exception!");
    }

    public static void main(String[] args) {
        try {
            MyYiT.firstException();
            MyYiT.secondException();
        } catch (MyYi myYi) {
            System.out.println("Exception: " + myYi.getMessage());
            myYi.printStackTrace();
        }
    }
}
