package staticKeyword;

public class useStatic {
    static int a = 10; // static variables
    int b = 20;

    // static method can only access static variables
    // static method can only call other static methods
    // static mehod can not use (this) and (super) keyword
    static void meth() {
        System.out.println("Value if a is 10 but static block executed first which adds 30 so -> " + a);
        // System.out.println("b = " + b); -> this is illegal because static method cannot use simple variables
    };



    // static keyword executed first when the class is first loaded.
    static{
        System.out.println("static blocks making changes in statc variable a -> ");
        // b = a * 10;                      -> this is illegal because static block can obly use static variables
        a = a + 30;
    };
}
