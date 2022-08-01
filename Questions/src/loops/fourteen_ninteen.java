package loops;

import java.util.Scanner;

public class fourteen_ninteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numbers:");
        int num = sc.nextInt();

        sum(num);
        System.out.println();
        product(num);
        System.out.println();
        reverse(num);
        System.out.println();
        palindrome(num);
        System.out.println();
        frequency(num);
        System.out.println();
        words(num);


        
        sc.close();
    }

    // fourteen
    private static void sum(int num) {
        int sum;
        for (sum = 0; num != 0; num = num / 10) {
            sum = sum + num % 10;
        }
        System.out.println("sum is -> " + sum);
    }

    // fifteen
    private static void product(int num) {
        int product;
        for (product = 1; num != 0; num = num / 10) {
            product = product * (num % 10);
        }
        System.out.println("product is -> " + product);
    }

    // Sixteen
    private static void reverse(int num) {
        String s1 = String.valueOf(num);
        String temp = "";
        char ch;
        for (int i = s1.length() - 1; i >= 0; i--) {
            ch = s1.charAt(i);
            temp += ch;
        }
        // converting temp string into integer again;
        int number = Integer.parseInt(temp);
        System.out.println("Reverse number -> " + number);
    }

    // Seventeen
    private static void palindrome(int num) {
        String s1 = String.valueOf(num);
        String temp = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            temp = temp + s1.charAt(i);
        }
        if (s1.equals(temp)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }

    // Eighteen
    private static void frequency(int num) {
        String s1 = String.valueOf(num);
        char ch;
        for (int i = 0; i < s1.length(); i++) {
            ch = s1.charAt(i);
            int count = 0;
            for (int j = 0; j < s1.length(); j++) {
                if (ch == s1.charAt(j)) {
                    count++;
                }
            }
            System.out.println("Frquency of char " + ch + " is " + count);
        }
    }
    // ninteen
    private static void words(long num) {
        String s1 = String.valueOf(num);
        for (int i = 0; i < s1.length(); i++) {
            switch (s1.charAt(i)) {
                case '0':
                    System.out.print("zero, ");
                    break;
                case '1':
                    System.out.print("one, ");
                    break;
                case '2':
                    System.out.print("two, ");
                    break;
                case '3':
                    System.out.print("three, ");
                    break;
                case '4':
                    System.out.print("four, ");
                    break;
                case '5':
                    System.out.print("five, ");
                    break;
                case '6':
                    System.out.print("six, ");
                    break;
                case '7':
                    System.out.print("seven, ");
                    break;
                case '8':
                    System.out.print("eight, ");
                    break;
                case '9':
                    System.out.print("nine, ");
                    break;
                default:
                    System.out.println();
                    break;
            }
        }

    }

}
