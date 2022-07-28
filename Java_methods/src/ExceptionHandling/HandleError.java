package ExceptionHandling;
import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0;
        System.out.println(a);
        Random r = new Random();
        int k = 0;

        for (int i = 0; i < 50; i++) {
            try{
                b = r.nextInt();
                a = 12345/(b);    // if any value will came as 0 then it will throw an error
            }
            catch(ArithmeticException e){
                // let's handle the eroor
                System.out.println("exception:" + e); 
                System.out.println("Arthmatic expression occurs " + k);
                k++;
                // so let make a = 0, then the error will be resolved 
                a = 0;
            }
        }
        System.out.println("No error comes ");
    }
}
