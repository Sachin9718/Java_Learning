package conditional;
import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter an integer number to check:\n");
        x = sc.nextInt();
        x = x % 2 == 0 ? 1 : 0;
        String result = (x == 1) ? "The input number is even.\n": "The input number is odd.\n";
        System.out.println(result);
        sc.close();
    }
}
