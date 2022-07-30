package string;

import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s1 = sc.nextLine();
        String s2 = s1;
        char temp;
        String s3 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            temp = s1.charAt(i);
            s3 += temp;
        }

        if (s2.equals(s3)) {
            System.out.println("Palindrome string");
        } else {
            System.out.println("Not a Palindrome string");
        }
        sc.close();
    }
}
