package string;

import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String s1 = sc.nextLine();
        char temp;
        String s2 = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            temp = s1.charAt(i);
            s2 += temp;
        }
        System.out.println("reverse string -> " + s2);

        sc.close();
    }
}
