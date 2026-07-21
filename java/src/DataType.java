public class DataType {
    static void main() {
        //numeric - short, byte, int, long
        byte num1 = 127;

        short num2 = 32767;

        int num3 = 50000;

        long num4 = 60592424;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        //floating dt
        float num5 = 3.14121229f; //7 places will print only
        System.out.println("float : "+ num5);

        double num6 = 3.142989898989;
        System.out.println(num6);

        //others - char, boolean
        boolean voter = true;
        System.out.println(voter);

        char first = 'A'; //prints A, small a = 97
        System.out.println((char)(first+3));
    }
}
