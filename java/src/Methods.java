public class Methods {
    //non parametric fucntion
    static void table(){
        for (int i = 1; i < 11; i++){
            System.out.println(2*i);
        }
    }

    // parametric - no return value/ void type
    static void sum(int x, int y){
        System.out.println("Sum is : "+ (x+y));
    }

    // funciton with return value / int return type
    static int add(int x, int y){
        return x+y;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static void solve(int num){
        System.out.println("Inside solve : "+ num);
        num = num*10;
        System.out.println("inside solve : "+ num);
    }

    static void printMulyiple(){
        int value = 20;
        for(int i = 1; i<=10; i++){
            System.out.println(value*i);
        }
    }
    static void main() {
            printMulyiple();

//        call by value
        int num = 5;
        System.out.println("inside main : "+num);
        solve(num);
        System.out.println("inside main : "+num);

        System.out.println("hi");
//        call table to print 2 table
        table(); // its red because main is static so to call table it also has to be static
        System.out.println("bye");

//        calling parametric function
        sum(2,5);

//        function with return type as int
        int sum = add(10,20);
        System.out.println(sum);
//
        int sum2  = add(10,20,30);
        System.out.println(sum2);
    }
}
