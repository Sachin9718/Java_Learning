import java.util.*;
public class Q12_thrd_angle {
    public static void main(String[] args) {
        System.out.println("Enter two angle of triangle");
        Scanner sc = new Scanner(System.in);
        int fAngle = sc.nextInt();
        int sAngle = sc.nextInt();
        int tAngle = 90 - (fAngle + sAngle);
        if(tAngle >= 90){
            System.out.println("Enter a valid value of triangle ");
        }
        else{
            System.out.println("Third of triangle is -> " + tAngle + " degree");
        }
        sc.close();
    }
}
