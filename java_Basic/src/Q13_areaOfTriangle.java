import java.util.*;
public class Q13_areaOfTriangle {
    public static void area(int base, int height) {
        float area = (float)(base*height)/2;
        System.out.println("Area of triangle is -> " + area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of triangle to get area");
        int base = sc.nextInt();
        int height = sc.nextInt();
        area(base,height);
        sc.close();
    }
}
