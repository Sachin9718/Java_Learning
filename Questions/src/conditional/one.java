package conditional;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Two Numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        comparetwo(a, b);
        comparethree(a, b, c);
        sc.close();
    }

    public static void comparetwo(int x, int y) {
        int big;
        big = (x > y) ? x : y;
        System.out.println("\nLargest = " + big);
    }

    public static void comparethree(int a, int b, int c) {
        int big;
        big = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("\nLargest = " + a + ", " + b + " and " + c + " is " + big);
    }
}
