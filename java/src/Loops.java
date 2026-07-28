public class Loops {
    static void main() {
        //for loops
        for (int i = 1; i<= 5; i++){
            System.out.println("Hello World!");
        }
        for (int day = 1; day <= 5; day++) {
            System.out.println(day);
        }

        for (int i = 1; i <=3;i++){
            for (int j = 1; j<=3;j++){
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        for (int i = 1; i <=3;i++){
            if(i == 2)
                break;
            System.out.println(i);
        }
        System.out.println("continue");
        for (int i = 1; i <=3;i++){
            if(i == 2)
                continue;
            System.out.println(i);
        }

        //while loop
        int count = 1; //init
        while (count <= 5) {
            System.out.println(count); // process
            count++; // updation
        }

        //do while loop
        int high = 10;
        do {
            System.out.println(high);
            high++;
        }while(high > 11);
    }
}
