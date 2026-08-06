public class StringMethods {
    static void main() {
        String name = "Krishna";
        String str = "KRISHNA";

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.equals(str));
        System.out.println(name.equalsIgnoreCase(str));

        String str2 = "";
        System.out.println(str2.length());
        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());

        str2 = "  ";
        System.out.println(str2.length());
        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());

        str = "  Krishna   ";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.trim().length());

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String big = "My name is krishna";
        System.out.println(big.substring(0,6));
        System.out.println(big.contains("krishna"));

        int a = 5123;
        String str4 = String.valueOf(a);
        System.out.println(str4 + 1);

        System.out.println(big.startsWith("My"));
        System.out.println(big.endsWith("krishna"));

        String s = "krishna";
        char[] ch = s.toCharArray();

        for(char c : ch){
            System.out.println(c);
        }

        name = "My , name, is, krishna";
        String[] arr = name.split(",");
        for (String sr : arr){
            System.out.println(sr);
        }

        name = "krishna";
        System.out.println(name.replace('k','l'));
    }
}
