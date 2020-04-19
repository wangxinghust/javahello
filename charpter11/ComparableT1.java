class Student implements Comparable<Student> {
    private String name;
    private int age;
    private float score;

    public Student(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student stu) {
        if (this.score > stu.score) {
            return -1;
        } else if (this.score < stu.score) {
            return 1;
        } else {
            if (this.age > stu.age) {
                return 1;
            } else if (this.age < stu.age) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}

public class ComparableT1 {
    public static void main(String[] args) {
        Student stu[] = {new Student("张三", 20, 90.0f),
                new Student("李四", 22, 90.0f), new Student("王五", 20, 99.0f),
                new Student("赵六", 20, 70.0f), new Student("孙七", 22, 100.0f)};
        java.util.Arrays.sort(stu);
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i]);
        }
    }
}
