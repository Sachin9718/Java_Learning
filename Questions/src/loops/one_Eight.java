package loops;

import java.util.Scanner;

public class one_Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        number(num);
        System.out.println("\n");
        revnumber(num);
        System.out.println("\n");
        alphabets();
        System.out.println("\n");
        evennum();
        System.out.println("\n");
        oddnum();
        System.out.println("\n");
        sum(num);

        sc.close();
    }

    private static void number(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i + "\t");
        }
    }

    private static void revnumber(int num) {
        for (int i = num; i >= 0; i--) {
            System.out.print(i + "\t");
        }
    }

    private static void alphabets() {
        char ch;
        for (ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }

    private static void evennum() {
        int number = 10, i;
        i = 2;
        int sum = 0;
        System.out.print("Even numbers: ");
        while (i <= number) {
            // prints the even number
            System.out.print(i + " ");
            sum += i;
            i = i + 2;
        }
        System.out.println("Sum: " + sum);
    }

    private static void oddnum() {
        int number = 10, i;
        int sum = 0;
        i = 1;
        System.out.print("Odd numbers: ");
        while (i <= number) {
            // prints the odd number
            sum += i;
            System.out.print(i + " ");
            i = i + 2;
        }
        System.out.println("Sum: " + sum);
    }

    public static void sum(int num) {
        int i = 0;
        int sum = 0;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("Sum  of : " + num + " is" + sum);

    }

}
