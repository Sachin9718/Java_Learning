package callByValue;

public class callByValue {
    public static void main(String[] args) {
        // object creation of test class
        test ob = new test();
        int a = 10 , b = 20;
        
        System.out.println("a and b value before call: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b value after call: " + a + " " + b);

    }
    // method meth have no effect on value of a and b because a & b pass as value so in meth i and j have different memory bolck
    // so the main a and b have no effect on test i and j and vice versa they just pass as value 
}
