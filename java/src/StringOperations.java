import java.sql.SQLOutput;

public class StringOperations {
    static void stringPrint(String s){
        for(int i = 0; i< s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }

    static int stringLength(String s){
        int len = 0;
        for(char ch  : s.toCharArray()){
            len++;
        }
        return len;
    }

    static int getVowelCount(String s){
        int count = 0;
        String vowels = "aeiouAEIOU";
        for(int i = 0; i < s.length(); i++){
            if(vowels.contains(String.valueOf(s.charAt(i)))){
                count++;
            }
        }
        return count;
    }

    static  String reverse(String s){
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(arr);
        return reversed;
    }

    static boolean checkPalindrome(String s ){
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    static void main() {
        String name = "Krishna";

        //print each char of string
        stringPrint(name);

        //string length without length
        System.out.println("Length of name is : " + stringLength(name));

        //count vowels
        System.out.println(getVowelCount(name));

        //revrese a string
        System.out.println(reverse(name));

        //palnidrome
        System.out.println(checkPalindrome("Madam"));
    }
}
