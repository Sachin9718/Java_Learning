package string;

import java.util.Scanner;

public class eighteen_nineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String s1 = sc.nextLine();
        int frq = 0;
        char frq_ch = ' ';
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int count = frq_occurance(s1, ch);

            if (count > frq) {
                frq = count;
                frq_ch = ch;
            }
        }
        System.out.println("Charachter " + frq_ch + " Highest frequency is " + frq);

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int count = last_occurance(s1, ch);

            if (count <= frq) {
                frq = count;
                frq_ch = ch;
            }
        }
        System.out.println("Charachter " + frq_ch + " Lowest frequency is " + frq);

        sc.close();
    }

    private static int last_occurance(String s1, char ch) {
        char temp;
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            temp = s1.charAt(i);
            if (temp == ch) {
                count++;
            }
        }
        return count;
    }

    private static int frq_occurance(String s1, char ch) {
        char temp;
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            temp = s1.charAt(i);
            if (temp == ch) {
                count++;
            }
        }
        return count;
    }

}
