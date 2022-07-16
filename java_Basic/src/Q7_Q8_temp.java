import java.util.*;
public class Q7_Q8_temp {
    public static void fahren(float celcius) {
        float fh = (float)(celcius*1.8)+32;
        System.out.println(celcius + "c is " + fh + "f");
    }
    public static void celcius(float fahren){
        float cel = (fahren-32)*(float)0.56;
        System.out.println(fahren + "f is " + cel+ "c");
    }
    public static void main(String[] args) {
        System.out.println("convertion from fahrenheit into celcius ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fahrenheit to convert into celcius ");
        float fh = sc.nextInt();
        celcius(fh);
        
        System.out.println("Enter celcius to convert into fahrenheit ");
        float cel = sc.nextInt();
        fahren(cel);
        sc.close();
    }
}
