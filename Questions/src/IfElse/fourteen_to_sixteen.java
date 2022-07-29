package IfElse;
import java.util.Scanner;
public class fourteen_to_sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 14 
        System.out.println("Enter three angles of triangle");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        if(one+two+three == 180){
            System.out.println("triangle is valid");
            // Question 16
            System.out.print("Above triagle is -> ");
            if(one == two && two == three) System.out.println(" Equilateral  ");
            else if(one == 90 || two == 90 || three == 90 ) System.out.println(" Right Angle");
            else if(one ==  60 && two == 60 && three == 60) System.out.println("Isoscles");
        } 
        else System.out.println("Trianlge is Invalid");



        // Question 15
        System.out.println("Enter lengths of trinalge");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if((side1+side2) > side3) System.out.println("Trinagle is valid");
        else System.out.println("Triangle is Invalide");

        sc.close();
    }
}
