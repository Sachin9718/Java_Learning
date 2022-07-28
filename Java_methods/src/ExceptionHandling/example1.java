package ExceptionHandling;

public class example1 {
    public static void main(String[] args) {
        System.out.println("Outside the try and catch");

        // code that we want to be monitor should be in try block
        try {
            System.out.println("Inside the try block");
            int d = 0;
            int l = 10 / d;
            System.out.println(l);
            System.out.println("This will not be print bro because exception already catched");
        } catch (ArithmeticException e) {
            System.out.println("After getting error, Inside catch block");
            System.out.println("d -> zero he bhai, dekh ke divide kiya kar love day");
        }
        System.out.println("After Catch statement completed");
    }
}
