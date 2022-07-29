package Basics;
import java.util.Scanner;
public class Q6_length_parameter {
    public static void meter(int length) {
        float meter = (float)length/100;
        System.out.println(length + "cm is " + meter + "meter");
    }
    public static void kilometer(int length) {
        float kilome = (float)length/100000;
        System.out.println(length + "cm is "+kilome +"kilometer");
    }
    public static void main(String[] args) {
        System.out.println("Enter your length in centimeter ->");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        meter(length);
        kilometer(length);
        sc.close();
    }
}
