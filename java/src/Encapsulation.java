public class Encapsulation {
    private String name;
    public int erollmentNumber;
    private int age;
    //getter
    public void getName(){
        System.out.println(this.name);
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    //getter for age
    public int getAge(){
        return this.age;
    }

    //setter for age with validation
    public void setAge(int age){
        if(age > 0 && age < 150){
            this.age = age;
        }else{
            System.out.println("Invalid age input");
        }
    }
}
