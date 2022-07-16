import java.util.*;
public class call {
    public static void main(String[] args) {
        // calling Q1_sum class 
        Q1_sum obj1 = new Q1_sum();
        int out = obj1.add(5,10);
        System.out.println(out);
        System.out.println(obj1.add(50,60));


        // calling Q2_arth class
        System.out.println("\nArthmatic operations\n");
        System.out.println("Enter Two numbers ->");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Q2_arth obj2 = new Q2_arth();
        System.out.println("adding -> " + obj2.add(x,y));
        System.out.println("subtracting -> " + obj2.sub(x,y));
        System.out.println("multiplication -> " + obj2.mult(x,y));
        System.out.println("modulus -> " + obj2.mod(x,y));



        // 
    }
}
