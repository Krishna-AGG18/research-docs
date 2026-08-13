public class Student {
    // attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //constructir
    public Student(){
        System.out.println("Student ctor called no-arg");
    }

    //parametric ctor
    public Student(int id, int age, int nos, String name){
        System.out.println("Student ctor called with-arg");
        this.id = id;
        this.age = age;
        this.nos = nos;
        this.name = name;
    }

    //copy ctor
    public Student(Student source){ //source ====> A
        System.out.println("Student ctor called with-copy");
        this.id = source.id;
        this.age = source.age;
        this.nos = source.nos;
        this.name = source.name;
    }

    //behaviors
    public void study(){
        System.out.println(name + " Studying");
    }
    public void sleep(){
        System.out.println(name + " Sleeping ");
    }
}
