import java.util.*;
// This program is not working properly. do -> optimized the code
public class Q10_pwr {
    public static int power(int x, int y) {
        // int pwr = x;
        for(int i = x; i <= y; i++){
            x = x * i;
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println("Enter value of x and int power y ->");
        int x,y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        int out = power(x,y);
        System.out.println(out);
        sc.close();
    }
}
