package string;

import java.util.Scanner;

public class twentysix {
    private static Scanner sc;

    public static void main(String[] args) {
        String repstCharStr;
        char replace_ch, new_ch;

        sc = new Scanner(System.in);

        System.out.print("\nEnter a String to replace last Char Occurrence =  ");
        repstCharStr = sc.nextLine();

        System.out.print("\nEnter a Character to Replace =  ");
        replace_ch = sc.next().charAt(0);

        System.out.print("\nEnter a New Character =  ");
        new_ch = sc.next().charAt(0);

        char[] replastCharArr = repstCharStr.toCharArray();
        int i = replastCharArr.length - 1;
        while (i >= 0) {
            if (replastCharArr[i] == replace_ch) {
                replastCharArr[i] = new_ch;
                break;
            }
            i--;
        }
        System.out.format("\nAfter replacing Last Occurrence of %c with %c = ", replace_ch, new_ch);
        System.out.print(replastCharArr);
    }
}