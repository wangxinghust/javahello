/**
 * 泛型类对象强制类型转换
 */
public class demoForceChange {
    public static void main(String[] args) {
        superGen<Integer> oa = new superGen<>(100);
        derivedGen<Integer, String> ob = new derivedGen<>(200, "Good");
        if ((superGen<Integer>) ob instanceof superGen) {
            System.out.println("derivedGen object is changed to superGen");
        }
        if ((derivedGen<Integer, String>) oa instanceof derivedGen) {
            System.out.println("superGen object is changed to derivedGen");
        }
    }
}
