package Patterns;

import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        int lib, p, q, r, x;
        // create object of scanner.
        Scanner s = new Scanner(System.in);

        // enter number of rows.
        System.out.print("Enter the rows : ");
        r = s.nextInt();
        lib = 1;
        q = 0;

        // here the pascals triangle.
        System.out.println("Pascal's Triangle : ");

        while (q < r) {
            for (p = 40 - 3 * q; p > 0; --p)
                System.out.print(" ");
            for (x = 0; x <= q; ++x) {
                if ((x == 0) || (q == 0))
                    lib = 1;
                else
                    lib = (lib * (q - x + 1)) / x;
                System.out.print("      ");
                System.out.print(lib);
            }
            System.out.println("");
            ++q;
        }
        s.close();

    }
}
