package string;

import java.util.Scanner;

public class twentyfive {
    private static Scanner sc;
    public static void main(String[] args) {
        String repstCharStr;
        char replace_ch, new_ch;
        int i = 0;

        sc = new Scanner(System.in);

        System.out.print("\nPlease Enter any String =  ");
        repstCharStr = sc.nextLine();

        System.out.print("\nEnter the Character to Replace =  ");
        replace_ch = sc.next().charAt(0);

        System.out.print("\nEnter the New Character =  ");
        new_ch = sc.next().charAt(0);

        char[] repstCharArr = repstCharStr.toCharArray();
        while (i < repstCharArr.length) {
            if (repstCharArr[i] == replace_ch) {
                repstCharArr[i] = new_ch;
                break;
            }
            i++;
        }
        System.out.format("\nThe Final String after replacing %c with %c = ", replace_ch, new_ch);
        System.out.print(repstCharArr);
    }
}
