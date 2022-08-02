package Patterns;

public class Diamond_Star {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else if (j <= i)
                    System.out.print(j - 1);
                else
                    System.out.print((2 * i - 1) - j);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else if (j <= i)
                    System.out.print(j - 1);
                else
                    System.out.print((2 * i - 1) - j);
            }
            System.out.println();
        }
    }
}
