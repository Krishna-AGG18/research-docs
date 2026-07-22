public class TypeCast {
    static void main() {
        //implicit - byte -> short -> int -> long
        byte n1 = 12;
        short n2 = n1;
        int n3 = n2;
        long n4 = n3;

        System.out.println("New num : "+ n4);

        //explicit
        long v1 =1234567011;
        //int v2 = v1;  not allowed we need to do it explicitly
        // there might be error or a random value
        int v2 = (int)v1;
        System.out.println(v2);
    }
}
