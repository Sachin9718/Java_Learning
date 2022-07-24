package staticKeyword;

public class callStatic {
    public static void main(String[] args) {
        // useStatic obj1 = new useStatic();
        // to access static methods and staic variabls we did not need any object
        // just access by classname.method() or classname.variable
        useStatic.meth();
        System.out.println("the value of a is -> " + useStatic.a);
    }
}
