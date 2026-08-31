package CollectionFramework.part3;
import java.util.*;

public class Students implements Comparable<Students> {
    public int age;
    public String name ;
    public int weight;

    public Students(int age, String name, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Students o) {
        //this method is called for current object , where object o is parameter
        //we are defining sorting logic
        //expects +ve, -ve or 0 to be returned in comparision to object o

        //sort basis on age
        if(this.age == o.age){
            return this.name.compareTo(o.name);
        }

        return this.age - o.age;
//        return o.age - this.age; //-----> for descening order sub o from this
    }
}
