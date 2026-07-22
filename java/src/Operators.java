public class Operators {
    static void main() {
        int a = 5;
        int b = 2;

        //arithmetic
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //relational
        System.out.println("a==b" + (a==b));
        System.out.println("a <= b" + (a <= b));
        System.out.println("a >= b" + (a >= b));
        System.out.println("a != b" + (a != b));
        System.out.println("a < b" + (a < b));
        System.out.println("a > b" + (a > b));

        //logical
        boolean c = true;
        boolean d = false;
        System.out.println("a && b " + (c && d));
        System.out.println("a || b " + (c || d));
        System.out.println("!a " + (!c));

        //assignment
        int rating = 100;
//      System.out.println(" " + a + " " + b + " "+ (a += b));
//      System.out.println(a);

        System.out.println(rating += 5);
        System.out.println(rating -= 5);
        System.out.println(rating *= 5);
        System.out.println(rating /= 5);
        System.out.println(rating %= 5);

        //unary
        int e = 10;

        System.out.println("+e " + (+e));
        System.out.println("-e " + (-e));
        System.out.println("e " + (e));
        System.out.println("++e " + (++e));
        System.out.println("e " + (e));
        System.out.println("e++ " + (e++));
        System.out.println("e " + (e));

        System.out.println("e "+ e);
        System.out.println("--e " + (--e));
        System.out.println("e "+e);
        System.out.println("e-- "+(e--));
        System.out.println("e "+ e);

    }
}
