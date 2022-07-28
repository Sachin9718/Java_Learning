package IfElse;

public class one_to_five {
    public static void main(String[] args) {
        // Question 1
        int num1 = 5;
        int num2 = 8;
        if (num1 > num2) {
            System.out.println("num1 is greater than num2");
        } else {
            System.out.println("num2 is greater than num2");
        }

        // Question 2
        int num3 = 3;
        if (num1 > num2) {
            if (num3 > num1) {
                System.out.println("num3 is gratest integer");
            } else {
                System.out.println("num1 is greates integer");
            }
        } else if (num2 > num1) {
            if (num3 > num2) {
                System.out.println("num3 is greatest");
            } else {
                System.out.println("num2 is greatest");
            }
        }

        // Question 3
        int i = 5;
        if (i > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is negative");
        }

        // Question 4
        int j = 55;
        if (j % 5 == 0 && j % 11 == 0) {
            System.out.println("Number is divisible by 5 and 11 both");
        } else {
            System.out.println("number is not divisible by 5 and 11 both");
        }

        int k = 10;
        if (k % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

        
        // Question 6
        char c = '@';
        if (c > 65 && c < 123) {
            System.out.println("this is a charchter");
        }else{
            System.out.println("this is not a charchter");
        }
    }
}
