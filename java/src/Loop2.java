public class Loop2 {
    static void main() {
        //prime number 1 to 100
        for(int i = 1; i<=100; i++){
            int n = i;
            boolean flag = false;
            if(n ==1) continue;
            for(int j = 2; j < n; j++){
                if(n % j == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) System.out.println(i);
        }

        //divisible by 7
        for (int i = 50; i<=100; i++){
            if(i % 7 ==0){
                System.out.println(i);
            }
        }
    }
}
