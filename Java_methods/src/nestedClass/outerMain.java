package nestedClass;

public class outerMain {
    public static void main(String[] args) {
        // calling outer class
        outer objOuter = new outer();
        objOuter.temp();


        outer2 obj2outer = new outer2();
        obj2outer.outer_meth();
    }
}
