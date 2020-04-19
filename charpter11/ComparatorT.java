import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects;

class Student11 {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public Student11(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 自动生成的toString()方法
     *
     * @return
     */
    @Override
    public String toString() {
        return "Student11{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        // 或者用instanceof来判断
        if (obj == null || getClass() != obj.getClass()) return false;
        Student11 student11 = (Student11) obj;
        return age == student11.age &&
                Objects.equals(name, student11.name);
    }
}

class Student11Comparator implements Comparator<Student11> {

    @Override
    public int compare(@NotNull Student11 s1, Student11 s2) {
        if (s1.equals(s2)) {
            return 0;
        } else if (s1.getAge() < s2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class ComparatorT {
    public static void main(String[] args) {
        Student11 stu[] = {new Student11("张三", 20),
                new Student11("李四", 22), new Student11("王五", 20),
                new Student11("赵六", 20), new Student11("孙七", 22)};
        java.util.Arrays.sort(stu, new Student11Comparator());
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i]);
        }
    }
}
