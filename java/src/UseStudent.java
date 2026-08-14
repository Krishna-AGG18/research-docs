public class UseStudent {
    static void main() {
        //call empty cons
        Student A = new Student();
        A.name = "Krishna";
        A.id = 1;
        A.age = 23;
        A.nos = 4;
        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.age);
        System.out.println(A.nos);
        A.study();
        A.sleep();

        //parametric cons
        Student B = new Student(2,23,5,"Bablu");
        System.out.println(B.name);
        System.out.println(B.id);
        System.out.println(B.age);
        System.out.println(B.nos);

        //copy cons
        Student C = new Student(B);
        System.out.println(C.name);
        System.out.println(C.id);
        System.out.println(C.age);
        System.out.println(C.nos);

        Student D = A;
        D.name = "Hello";
        System.out.println("A : "+ A.name + " B : " + D.name);
    }
}
