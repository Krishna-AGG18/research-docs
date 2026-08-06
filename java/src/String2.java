import java.util.Scanner;

public class String2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide string : ");
        String str = sc.next();
        System.out.println("Value for next  :  "+str);
        sc.nextLine(); // TO READ THAT BUFFER LEFT

        System.out.println("Provide string : ");
        String str2 = sc.nextLine();
        System.out.println("Value for nextLine  :  "+str2);

    }
}
