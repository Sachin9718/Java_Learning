package IfElse;
import java.util.Scanner;
public class twenty {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double basic = 20000.50, gross, da, hra;
        
        System.out.println("Enter the Basic Salary :- ");
        basic = sc.nextDouble();
        if (basic <= 10000) {
            da = basic * 0.8;
            hra = basic * 0.2;
        } else if (basic <= 20000) {
            da = basic * 0.9;
            hra = basic * 0.25;
        } else {
            da = basic * 0.95;
            hra = basic * 0.3;
        }
        gross = basic + da + hra;
        System.out.println("The Gross Salary is :-" + gross);
        sc.close();
    }
}
