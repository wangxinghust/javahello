public class ceshi {
    public static void main(String[] args) {
        Object hello = "Hello";
        System.out.println("true or false: " + (hello instanceof Object));
        System.out.println("true or false: " + (hello instanceof String));
        System.out.println("true or false: " + (hello instanceof Math));
        System.out.println("true or false: " + (hello instanceof Comparable));
        String a = "Hello";
        // 编译无法通过，类型不匹配
        //System.out.println("true or false: "+(a instanceof Math));
    }
}
