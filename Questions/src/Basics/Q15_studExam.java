package Basics;
import java.util.Scanner;
public class Q15_studExam {
    public static void marks(int a, int b, int c, int d, int e) {
        float total = a+b+c+d+e;
        float avg = total/5;
        float pert = (float)(total/500)*100;
        System.out.println("Total marks is -> " + total);
        System.out.println("average marks in all subj -> " + avg);
        System.out.println("Percentage of student is -> " + pert+"%");
    }
    public static void main(String[] args) {
        System.out.println("Enter five subject marks ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        marks(a, b, c, d, e);
        sc.close();
    }
}
