import java.util.*;
public class Q5_circle {
    public static double prm(int r) {
        return 2*3.14*r;
    }
    public static double area(int r){
        return 3.14 * r * r;
    }
    public static int diameter(int r){
        return r*2;
    }

    public static void main(String[] args) {
        System.out.println("Enter Radius of circle ");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double circumference = prm(radius);
        double area = area(radius);
        System.out.println("circumference of circle -> " + circumference);
        System.out.println("area of circle -> " + area);
        sc.close();
    }
}
