import java.util.*;
public class Q9_days {
    public static void calender(int No_days) {
        int year,week,days;
        days = No_days;
        year = No_days/365;
        No_days = No_days%365;  // remaining days after divided by 365
        week = No_days/7;
        No_days = No_days%7;    // remaining days after divided by 7;
        System.out.println(days + " days means " + year + " year, " + week + " week, " + No_days + " days");
    }
    public static void main(String[] args) {
        System.out.println("Enter no. of days here -> ");
        Scanner sc = new Scanner(System.in); 
        int days = sc.nextInt();
        calender(days);
        sc.close();
    }
}
