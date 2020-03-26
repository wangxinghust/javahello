import java.util.Arrays;
import java.util.List;

public class Nestmate {
    public static void main(String[] args) {
        // 结果与书不同
        System.out.println(Entity.class.isNestmateOf(Entity.class));
        System.out.println(Entity.class.isNestmateOf((Entity.InnerEntity.class)));
        System.out.println(Entity.class.isNestmateOf(Entity.AnotherInnerEntity.class));
        System.out.println(Entity.InnerEntity.class.isNestmateOf(Entity.AnotherInnerEntity.class));
        System.out.println(List.class.getNestHost());
        System.out.println(Arrays.class.getNestHost());
    }
}
