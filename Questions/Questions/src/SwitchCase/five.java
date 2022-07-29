package SwitchCase;
import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int num2 = sc.nextInt();
        switch (num2 % 2) {// this will return 1
            case 0:
                System.out.println(num2 + " is a Even number");
                break;
            case 1:
                System.out.println(num2 + " is a Odd number");
        }
        sc.close();
    }
}
