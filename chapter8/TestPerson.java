public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        //无法访问
        //p.age=1000;
        p.setAge((1000));
        System.out.println(p.getAge());
        p.setAge(50);
        System.out.println(p.getAge());
        p.setName("alice");
        System.out.println(p.getName());
    }
}
