package Ch_14_Generics.GenricEx;

public class GenDemo {
    public static void main(String[] args) {

        // Create an genreic obj of Integer type
        GenClass<Integer> iob = new GenClass<Integer>(100);
        iob.showTtype();
        System.out.println("Value of iob in generic is: " + iob.getobj());

        System.out.println();

        // Create an generic obj of String type
        GenClass<String> sob = new GenClass<String>("Sachin Yadav");
        sob.showTtype();
        System.out.println("Value of sob in generic class is: " + sob.getobj());


        System.out.println();

        // Two parametazied Genric
        TwoGenClass<Integer, String> ob = new TwoGenClass<Integer, String>(45, "SinniS");
        ob.show();
        System.out.println("Value of T: " + ob.gett());
        System.out.println("Value of T: " + ob.getv());

    }
}
