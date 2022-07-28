package IfElse;

import java.util.Scanner;

public class twentyone {
    public static double electricityBill(Double units) {
        // For first 50 units Rs. 0.50/unit
        // For next 100 units Rs. 0.75/unit
        // For next 100 units Rs. 1.20/unit
        // For unit above 250 Rs. 1.50/unit
        

        if (units <= 50) {
            return (units * 0.50);
        }
        else if (units <= 150) {
            return (100 * 0.75) + (units - 50) * 0.50 ;
        }
        else if (units > 250) {
            return (100 * 0.75) + (100 * 0.75) + (units - 200 )* 0.50;
        }
        return 0;
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your units");
        double units = sc.nextInt();
        double billpay = electricityBill(units);
        System.out.println("Your electricity bill is -> " + billpay);

        sc.close();
        
    }
}
