package inheritance.abstractClass;

public class call {
    public static void main(String[] args) {
        // we cannot make figure object because figure is a abstract class

        var r = new rectangle(20, 30);
        var t = new triangle(20, 30);

        // here f is reference variable fo figure class or superclass
        // by which now f can be used to refer any subclass object
        figure f;

        // here r is sublass object and it is passed to f reference variable
        f = r;
        System.out.println("Area or rectangle by using reference variable f -> " + f.area());
        System.out.println(t.area());
        System.out.println(r.area());
    }
}
