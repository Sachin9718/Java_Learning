package string;

import java.util.Scanner;

public class fourteen_seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String s1 = sc.nextLine();
        System.out.print("Enter a charachter to find its first occurance: ");
        char ch = sc.nextLine().charAt(0);
        firstoccurace(s1, ch);
        lastoccurance(s1, ch);
        alloccurance(s1,ch);
        sc.close();
    }

    public static void firstoccurace(String s1, char ch) {
        System.out.println("First occurance");
        char temp;
        for (int i = 0; i < s1.length(); i++) {
            temp = s1.charAt(i);
            if (temp == ch) {
                System.out.println(ch + " is found at index " + i);
                break;
            }
        }
    };
    public static void alloccurance(String s1, char ch) {
        System.out.println("All occurance");
        char temp;
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            temp = s1.charAt(i);
            if (temp == ch) {
                count++;
                System.out.println(ch + " is found at index " + i);
                // break;
            }
        }
        System.out.println("Counting of occurance is: " + count);
    };

    public static void lastoccurance(String s1, char ch) {
        System.out.println("Last occurance");
        char temp;
        for (int i = s1.length() - 1; i >= 0; i--) {
            temp = s1.charAt(i);
            if (temp == ch) {
                System.out.println(ch + " is found at index " + i);
                break;
            }
        }
    }
}
