package IfElse;
import java.util.Scanner;
public class eight_to_thirteen {
    public static void main(String[] args) {
        // Question 8
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 65 || ch == 97 || ch == 69 || ch == 101 || ch == 73 || ch == 105 || ch == 79 || ch == 111 || ch == 85 || ch == 117) System.out.println("Ch is a vowel");
        else System.out.println("ch is a cononant");

        // Question 9
        char ch2 = sc.next().charAt(0);
        if((ch2>32 && ch2<47) || (ch2>57 && ch2<65) || (ch2 >90 && ch2<97)) System.out.println("ch2 is a special charachter");
        else if(ch2>47 && ch2 < 58) System.out.println("ch2 is a Integer");
        else if((ch2> 65 && ch2< 90)|| (ch2>96&&ch2<123)) System.out.println("ch2 is a charachter");

        // Question 10
        char ch3 = sc.next().charAt(0);
        if(ch3>65 && ch3 <90)System.out.println("ch3 is Upper case charchter");
        if(ch3>96 && ch3 <123)System.out.println("ch3 is Smaller case charchter");

        // Question 13
        System.out.println("Enter your amount value -->");
        long amount1 = sc.nextInt();
        long twoth = amount1/2000;
        long amount2 = amount1 % 2000;
        long oneth = amount2 / 1000;
        long amount3 = amount2 % 1000; 
        long fivh = amount2/500;
        long amount4 = amount3%500;
        long twoh = amount3/200;
        long amount5 = amount4%200;
        long oneh = amount4/100;
        long amount6 = amount5%100;
        long fif = amount5/50;
        long amount7 = amount6%50;
        long twn = amount7/20;
        long amount8 = amount7%20;
        long ten = amount8/10;
        long amount9 = amount8%10;
        long five = amount9/5;
        long amount10 = amount9%5;
        long two = amount10/2;
        long amount11 = amount10%2;
        long one = amount11/1;

        System.out.println("Amount: " + amount1 + " needs these notes ->");
        System.out.println("2,000 -> " + twoth);
        System.out.println("1,000 -> " + oneth);
        System.out.println("500   -> " + fivh);
        System.out.println("200   -> " + twoh);
        System.out.println("100   -> " + oneh);
        System.out.println("50    -> " + fif);
        System.out.println("20    -> " + twn);
        System.out.println("10    -> " + ten);
        System.out.println("5     -> " + five);
        System.out.println("2     -> " + two);
        System.out.println("1     -> " + one);
        sc.close();
    }
}