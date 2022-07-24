package varInference;
import java.util.*;
public class typeInfe {
    public static void main(String[] args) {
        var num = 10;
        System.out.println("var as integer: " + num);
        var deci = 3.14;
        System.out.println("var as double: " + deci);

        var array =  new int[5];

        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<array.length; i++){
            array[i] =  sc.nextInt();
        }
        System.out.print("var as array -> " );
        for (int i : array) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
