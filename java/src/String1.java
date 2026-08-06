import java.sql.Struct;

public class String1 {
    static void main() {
        String firstName = "Krishna";
        String lastName = "Aggarwal";

        System.out.println(firstName + " " + lastName);

        //access element
//        System.out.println(firstName[0]); ----> error dega ye
        System.out.println(firstName.length());
        System.out.println(firstName.charAt(5));

        //comparision
        String name1 = "Love";
        String name2 = "Love";

        if(name1 == name2){
            System.out.println("both are equal");
        }else {
            System.out.println("Not equal");
        }

        if(name1.equals(name2)){
            System.out.println("both are equal");
        }else {
            System.out.println("Not equal");
        }

        if(name1.equalsIgnoreCase(name2)){
            System.out.println("both are equal");
        }else {
            System.out.println("Not equal");
        }

        System.out.println(name1.indexOf("LL"));
    }
}
