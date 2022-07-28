package IfElse;

import java.util.Scanner;

public class seventeen {
    public static void main(String[] args) {

        // value a, b, and c
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a, b, c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double root1, root2;

        // calculating b2 - 4ac)
        double determinant = ((b * b) - (4 * a * c));

        // check if determinant is greater than 0
        if (determinant > 0) {
            System.out.println("determinant is greater than zero");
            // two real and distinct roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 -> " +root1);
            System.out.format("root2 -> "+ root2);
        }

        // check if determinant is equal to 0
        else if (determinant == 0) {
            System.out.println("determinant is equal to zero");
            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.format(" so both root1 and root is same -> "+root1);
        }
        sc.close();
    }

}
