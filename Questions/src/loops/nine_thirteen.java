package loops;

import java.util.Scanner;

public class nine_thirteen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("table number: ");
        int table = sc.nextInt();
        table(table);
        System.out.println();
        System.out.print("Digits: ");
        int digi = sc.nextInt();
        digicount(digi);
        System.out.println();
        First_Last_Digit(digi);
        System.out.println();
        swaping(digi);
        sc.close();
    }

    private static void table(int N) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }

    private static void digicount(int N) {
        int count = 0;
        while (N != 0) {
            // num = num/10
            N /= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);
    }

    private static void First_Last_Digit(int number) {

        int first_digit, last_digit;
        first_digit = number;
        while (first_digit >= 10) {
            first_digit = first_digit / 10;
        }
        last_digit = number % 10;

        System.out.println("\nThe First Digit : " + number + "  =  " + first_digit);
        System.out.println("\nThe Last Digit  : " + number + "  =  " + last_digit);
        System.out.println("Sum of First and Last digits : " + (first_digit + last_digit));


    }
    private static void swaping(int number) {
        String s1 = String.valueOf(number);  //making number into string
        char[] arr = s1.toCharArray();         // making string into array
        char first = arr[0];
        char last = arr[arr.length - 1];
        
        arr[0] = last;
        arr[arr.length - 1] = first;

        number = Integer.parseInt(String.valueOf(arr));
        System.out.println("Swapped first and last digit ->" + number);
    } 

}
