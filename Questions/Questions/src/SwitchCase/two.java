package SwitchCase;
import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        int days;
        System.out.printf("Enter month number: ");
        month = sc.nextInt();

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                System.out.println("Number of Days in month " + month + " are -> " + days);
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                System.out.println("Number of Days in month " + month + " are -> " + days);
                break;

            case 2:
                days = 28;
                break;

            default:
                days = 0;
                break;
        }
        sc.close();
    }
}
