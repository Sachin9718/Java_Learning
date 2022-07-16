import java.util.*;
public class Q16_SimpleInterest {
    public static void simpInt(int principal, int rate, int time) {
        float si = ((float)(principal*rate*time))/100;
        System.out.println("Simple Interest is -> " + si);
    }
    public static void compInt(float principal, float rate, float time, float freq) {
        float ci = (principal*(1+(rate/freq)))-principal;
        System.out.println("Compound Interest is -> " + ci);
    }
    public static void main(String[] args) {
        System.out.println("Enter values of Principal, Rate and time");
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        System.out.println("Simple Interest");
        simpInt(principal, rate, time);
        System.out.println("Compound Interest");
        System.out.println("Enter frequency of compound interest");
        int n = sc.nextInt();
        compInt(principal, rate, time, n);
        sc.close();
    }
}