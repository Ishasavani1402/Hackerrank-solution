import java.util.Scanner;

public class hackerrank {
    static String capital(String str , String str1){
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sb1 = new StringBuilder(str1);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        sb1.setCharAt(0, Character.toUpperCase(sb1.charAt(0)));
        return sb.toString() + " " + sb1.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
      //sum of two string length
        int length = str.length() + str1.length();
        System.out.println(length);

        //compare two string lexicographically
        int a = str.compareTo(str1);
        if (a < 0) {
            System.out.println("No");
        } else if (a > 0) {
            System.out.println("Yes");
        }
      //print first character capital of whole string using string builder method
        String r = capital(str, str1);
        System.out.println(r);

        sc.close();
    }
}
