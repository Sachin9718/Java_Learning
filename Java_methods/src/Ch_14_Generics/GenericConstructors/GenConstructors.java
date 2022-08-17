package Ch_14_Generics.GenericConstructors;

public class GenConstructors {
    private double val;

    // generic constructors
    <T extends Number> GenConstructors(T val) {
        this.val = val.doubleValue();
    }

    // show the value
    void show() {
        System.out.println("Value is:" + val);
    }
}
