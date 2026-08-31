
import CollectionFramework.part3.comparator.Student;
import CollectionFramework.part3.comparator.WeightComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainStudent {
    static void main() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(19,"abc",68));
        students.add(new Student(20,"def",90));
        students.add(new Student(21,"ghi",88));
        students.add(new Student(21,"ahi",88));
        students.add(new Student(10,"jkl",108));

        System.out.println(students);
        //Collections.sort(students); //----> error does not implement comparable, as soon as you enter data to sort , uske comparable ki implementation dekhi since we have not implemented it so it gives error

        //  INLINE COMPARATOR
        //Collections.sort(students, new Comparator<Student>() {
            //@Override
//            public int compare(Student o1, Student o2) {
//                return o1.weight - o2.weight;
//            }
//        }); -----> define inline only

        //Lambda functions
        //Collections.sort(students, (s1,s2) -> s1.weight - s2.weight);

        // USE A COMMON COMPARATOR / RESUABLE COMPARATOR...
        Collections.sort(students, new WeightComparator()); // ---> reusable comparator
        System.out.println(students);

    }
}
