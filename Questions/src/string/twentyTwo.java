package string;

import java.util.Scanner;

public class twentyTwo {
    public static void main(String[] args) {

        String delLastCharStr;
        char del_ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter String to Find First Char Occur =  ");
        delLastCharStr = sc.nextLine();

        System.out.print("\nEnter the Character to Find =  ");
        del_ch = sc.next().charAt(0);

        int i = delLastCharStr.length() - 1;

        while (i >= 0) {
            if (delLastCharStr.charAt(i) == del_ch) {
                break;
            }
            i--;
        }
        String out = delLastCharStr.substring(0, i) + delLastCharStr.substring(i + 1);

        System.out.println("\nThe Final String after Deleting " + del_ch + " = " + out);
        sc.close();
    }
}
