package ExceptionHandling;

public class ThrowDemo {
    public static void demoproc() {
        try {
            throw new NullPointerException("demo");   // thorowing exeption explicitly
        } catch (NullPointerException e) {
            System.out.println("Exception inside demoproc ");
            throw e;     // thowing same exeption for main method
        }
    }
    public static void main(String[] args) {
        try{
            demoproc();    // running demoproc method and getting exeption from there
        }
        catch(NullPointerException e){  // caughring exepeiton
            System.out.println("Recaugth exception in main method" + e);
        }
    }
}
