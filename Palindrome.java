import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        String rev= "";
        System.out.println("enter a string:");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();

        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            rev = rev + str.charAt(i);
        }

        if (str.toLowerCase().equals(rev.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
