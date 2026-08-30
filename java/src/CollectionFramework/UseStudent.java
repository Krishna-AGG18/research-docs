package CollectionFramework;

import java.util.HashSet;

public class UseStudent {
    static void main() {
        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(1,"Krishna");
        Student s2 = new Student(1,"Krishna");
        Student s3 = new Student(1,"Krishna");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);

    }
}
