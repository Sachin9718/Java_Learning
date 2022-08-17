package Ch_14_Generics.GenericConstructors;

public class GenConsDemo {
    public static void main(String[] args) {
        GenConstructors test = new GenConstructors(100);
        GenConstructors test2 = new GenConstructors(123.F);

        test.show();
        test2.show();
    }
}
