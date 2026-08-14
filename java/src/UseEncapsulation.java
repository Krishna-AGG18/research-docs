public class UseEncapsulation {
    static void main() {
        //getter setter use
        Encapsulation e = new Encapsulation();
//        System.out.println(e.name);  error
        System.out.println(e.erollmentNumber); // initially zero as its int
        e.erollmentNumber = 002;
        System.out.println(e.erollmentNumber);
        e.setName("Krishna");
        e.getName();

        //with validation
        e.setAge(-2);
        e.setAge(10);
        System.out.println(e.getAge());
    }
}
