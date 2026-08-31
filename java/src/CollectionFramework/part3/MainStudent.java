package CollectionFramework.part3;
import java.util.*;


public class MainStudent {
    static void main() {
        List<Students> students = new ArrayList<>();
        students.add(new Students(19,"abc",68));
        students.add(new Students(20,"def",90));
        students.add(new Students(21,"ghi",88));
        students.add(new Students(21,"ahi",88));
        students.add(new Students(10,"jkl",108));

        System.out.println(students);
        Collections.sort(students); //----> error does not implement comparable, as soon as you enter data to sort , uske comparable ki implementation dekhi since we have not implemented it so it gives error
        System.out.println(students);




    }
}
