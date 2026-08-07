public class BasicMaths {
    //get digits of a number
    static void getDigits(int num){
        if(num != 0) {
            while (num > 0) {
                System.out.println(num % 10);
                num /= 10;
            }
        }else{
            System.out.println(0);
        }
    }

    //count digits of a number
    static int countDigits(int num){
        if(num == 0)
            return 1;

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    //sum of digits
    static int sumDigits(int num){
        if(num >=0 && num <= 9)
            return num;

        int sum = 0;
        while (num > 0) {
            sum = sum + (num%10);
            num /= 10;
        }
        return sum;
    }

    //reverse of a num
    static int reverseNum(int num){
        if(num >=0 && num <= 9)
            return num;

        int sum = 0;
        while (num > 0) {
            sum = (sum*10) + (num%10);
            num /= 10;
        }
        return sum;
    }

    //palindrome
    static boolean checkPalindrome(int num){
        int reverse = reverseNum(num);
        return reverse == num;
    }

    //check prime
    static boolean checkPrime(int num){
        if(num < 2)
            return false;

//        for(int i = 2; i < num ; i++){
//        for(int i = 2; i <= Math.sqrt(num) ; i++){
        for(int i = 2; i <= Math.sqrt(num) ; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    //get gcd
    static int getGCD(int a,int b){
        //gcd(a,b) = gcd(b,a%b)
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    //getLCM
    static int getLCM(int a, int b){
        int gcd = getGCD(a,b);
        int prod = a*b;
        int lcm = prod / gcd;

        return lcm;
    }

    //ARMSTRONG number
    static boolean checkArmstrong(int num){
        if (num >= 0 && num < 10)
            return true;

        int temp = num;
        int nDigits = countDigits(num);
        int sum = 0;
        while(num > 0){
            int rem = num%10;
            sum = (int) (sum + Math.pow(rem,nDigits));
            num /= 10;
        }

        return (sum == temp) ;
    }

    //check perfect number
    static boolean checkPerfect(int num){
        int temp = num;
        int sum = 1;
        for(int i = 2; i*i <= temp; i++){
            if(temp % i == 0){
                int firstFactor = i;
                int secondFactor = num / i;
                sum += firstFactor + secondFactor;
            }
        }

        return sum == num;
    }

    //print all primes
    static void getAllPrimes(int n){
        System.out.println("Prime number between 1 and " + n);
        for(int i = 2; i <= n; i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }

    static void main() {
        //get digits of a number
        getDigits(87844984);

        //count digits
        System.out.println(countDigits(0));
        System.out.println(countDigits(12455450));

        // sum of digits of a num
        System.out.println("Sum of digits of a num 12345 : " + sumDigits(12345));

        //reverse a num
        System.out.println("Reverse of num 12345 : " + reverseNum(12345));

        //check palindrome
        int num2 = 123;
        System.out.println(num2 + " is a palindrome : " + checkPalindrome(num2));

        //check prime
        System.out.println(checkPrime(1));
        System.out.println(checkPrime(8));

        //get GCD
        System.out.println(getGCD(18,12));

        //LCM
        System.out.println(getLCM(18,12));

        //check armstrong
        System.out.println(checkArmstrong(153));

        //check perfect number
        System.out.println(checkPerfect(6));

        //get all primes
        getAllPrimes(100);
    }
}
