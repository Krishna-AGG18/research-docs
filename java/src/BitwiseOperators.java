import java.util.*;

public class BitwiseOperators {
    static String checkOddorEven(int a){
        if((a & 1 ) == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }

    static boolean checkPowerofTwo(int n){
        return (n & (n-1)) == 0;
    }


    static void main() {
        int a = 5;
        int b = 6;

        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + (a ^ b));
        System.out.println("~ a : " + (~a));

//        int n = 5;
//        for(int i = 1; i <= 32; i++){
//            n = n << 1;
//            System.out.println(n);
//        }

//        int n = 100;
//        for(int i = 1; i <= 10 ; i++){
//            n = n >> 1;
//            System.out.println(n);
//        }
        System.out.println("11 is : " + checkOddorEven(11));
        System.out.println("12 is : " + checkOddorEven(12));

        int n = 5;
        int count = 0;
        while(n != 0){
            if((n & 1) != 0){
                count ++;
            }
            n = n >> 1;
        }
        System.out.println("Set bit count : " + count);

        System.out.println("23 is power of two ? : " + checkPowerofTwo(23));


    }
}
