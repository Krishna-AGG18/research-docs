import java.lang.foreign.ValueLayout;
import java.util.Scanner;

public class Input {
    static void main() {
//        int a = 10;
//        int b = 20;
//        System.out.println(a+b);

        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for first num : ");
        int f1 = sc.nextInt(); //integer input
        System.out.println("Enter the value for SECOND num : ");
        int f2 = sc.nextInt();
        System.out.println("Answer for f1 + f2 : " + (f1 + f2));

        System.out.println("Enter the value for flag num : ");
        boolean flag = sc.nextBoolean();
        System.out.println("Enter the value for value num : ");
        short value = sc.nextShort();
        System.out.println("Enter the value for floatValue num : ");
        float floatValue = sc.nextFloat();

        System.out.println("flag is : " + flag);
        System.out.println("value is : " + value);
        System.out.println("floatVALUE is " + floatValue);+
    }
}
