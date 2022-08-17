package Ch_14_Generics.GenericMethods;

// Non generic Class
public class GenericMethods {

    // Generic method
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y ){
        for (int i = 0; i < y.length; i++) {
             if(x.equals(y[i])) return true;
        }
        return false;
    }
}
